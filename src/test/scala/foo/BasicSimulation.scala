package foo

import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.util.Random

object resourceLoader {
  def apply(filename:String) = scala.io.Source.fromInputStream(getClass.getResourceAsStream("/"+filename)).mkString
}

object CsvFileWriter {
  val filename = "output_%s.csv".format(Random.alphanumeric.take(16).mkString)
  val timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

  val initFw = new FileWriter(filename, false)
  initFw.append("endpoint,time,rows,secs\n")
  initFw.close()

  def writeLn(endpoint:String, timestamp: Date, rowCount: Int, secs:Long): Unit = {
    val f = new FileWriter(filename, true)
    f.append("%s,%s,%s,%s\n".format(endpoint, timeFormat.format(timestamp), rowCount, secs))
    f.close()
  }
}

object BasicSimulation { // 3

  val defaultHttpConf = http
    .baseURL("https://fsm2.education.gov.uk") // 5
    .acceptHeader("text/html,text/xml,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:55.0) Gecko/20100101 Firefox/55.0")
    .contentTypeHeader("application/x-www-form-urlencoded")
    .connectionHeader("keep-alive")

  val rows = csv("30h.csv")
  val random = new Random()
  val loginform = resourceLoader("portal_login.txt")
  val singlequeryform = resourceLoader("portal_single.txt")
  val batchqueryform = resourceLoader("portal_batch.txt")
  val batchRequestTemplate = resourceLoader("soap_batch.xml")
  val batchRequestRecordTemplate = resourceLoader("soap_batch_record.xml")
  val batchStatusTemplate = resourceLoader("soap_batchstatus.xml")
  val requestBody = resourceLoader("soap_30H.xml")

  // I am sorry about this. The correct way would be to use XPATHS, however the HTML returned by the service is not fully
  // valid XML, causing Gatling's "xpath" check to fail when it tries to extract information.
  // This regex is long, horrible and brittle, and the likely cause of this test breaking
  // ANYWAY, it captures the first, sixth and seventh column of a table row, if the third row is equal to the uploaded file name
  // (${FileName} is substituted by Gatling's expression engine), see batchBodyFeeder
  val horribleRowRegex = Array(
    "([^<]*)",
    "30H",
    "${FileName}",
    "[^<]*",
    "[^<]*",
    "([^<]*)",
    "([^<]*)").mkString("<td[^>]*>","<\\/td>\\s*<td[^>]*>","<\\/td>")

  def portalBatchScenario(minBatchSize: Int, maxBatchSize:Int) = {
    def batchBodyFeeder = Iterator.continually {
      val filename = "sample_%s.csv".format(Random.alphanumeric.take(16).mkString)
      val rowCount = minBatchSize + random.nextInt(maxBatchSize - minBatchSize)
      Map("BatchRequestBody" ->
        batchqueryform.format(
          filename,
          Array.fill(rowCount) {
            var x = rows.records(random.nextInt(rows.records.length))
            while (x("ParentNino").contains(" ") || x("ChildDob").contains("2017")) x = rows.records(random.nextInt(rows.records.length))

            "%s,%s,%s\n".format(
              x("ParentNino"),
              new java.text.SimpleDateFormat("yyyyMMdd").format(new java.text.SimpleDateFormat("M/d/yyyy").parse(x("ChildDob"))),
              x("EligibilityCode"))
          }.mkString),
        "FileName" -> filename,
        "RowCount" -> rowCount)}

    scenario("Portal: Batch Query (%s - %s)".format(minBatchSize, maxBatchSize)) // 7
      .feed(batchBodyFeeder)
      .exec(http("go_home").get("/fsm.laportal/Sandpit/Default.aspx").check(status.is(200))).pause(2)
      .exec(http("go_login").get("/fsm.laportal/Sandpit/PortalLogin.aspx").check(status.is(200))).pause(2)
      .exec(http("do_login").post("/fsm.laportal/Sandpit/PortalLogin.aspx").body(StringBody(loginform))).pause(2)
      .exec(http("go_batchQuery")
        .get("/fsm.laportal/Sandpit/UploadBatchQuery.aspx")
        .check(status.is(200)))
      .exitHereIfFailed
      .pause(2)
      .exec(http("do_batchQuery")
        .post("/fsm.laportal/Sandpit/UploadBatchQuery.aspx")
        .header("Content-Type","multipart/form-data; boundary=---------------------------180931935016414")
        .body(StringBody("${BatchRequestBody}"))
        .check(status.is(200))
        .check(substring("Your Query file has been uploaded and will be processed shortly.").exists))
      .exitHereIfFailed
      .asLongAs(session => session("batch_info").asOption[(String, String, String)] match {case None => true case Some(n) => n._2!="QueryComplete" }) {
        pause(30).exec(http("Check batch query status")
          .get("/fsm.laportal/Sandpit/MyQueries.aspx")
          .check(status.is(200))
          .check(regex(horribleRowRegex).ofType[(String, String, String)].saveAs("batch_info"))
        ).exec{s =>
          Console.println(horribleRowRegex)
          Console.println(s("batch_info").asOption[(String, String, String)])
          s}
        .exitHereIfFailed
      }
      .exec {session =>
        val d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val batchInfo = session("batch_info").asOption[(String, String, String)].get
        CsvFileWriter.writeLn(
          "Portal",
          d.parse(batchInfo._1),
          session("RowCount").as[Int],
          (d.parse(batchInfo._3).getTime - d.parse(batchInfo._1).getTime)/1000)

        session
      }
  }

  val portalSingleQueryBodyFeeder = Iterator.continually(Map("SingleQueryBody" -> {
      val row = rows.records(random.nextInt(rows.records.length))
      val dob = Calendar.getInstance()
      dob.setTime(new SimpleDateFormat("M/d/yyyy").parse(row("ChildDob")))
      singlequeryform.format(
        row("EligibilityCode"),
        row("ParentNino"),
        dob.get(Calendar.DAY_OF_MONTH),
        dob.get(Calendar.MONTH) + 1,
        dob.get(Calendar.YEAR))}))

  def portalSingleScenario = scenario("Portal: Single Query") // 7
    .feed(portalSingleQueryBodyFeeder)
    .exec(http("go_home").get("/fsm.laportal/Sandpit/Default.aspx").check(status.is(200))).pause(2)
    .exec(http("go_login").get("/fsm.laportal/Sandpit/PortalLogin.aspx").check(status.is(200))).pause(2)
    .exec(http("do_login").post("/fsm.laportal/Sandpit/PortalLogin.aspx").body(StringBody(loginform))).pause(2)
    .exec(http("go_singleQuery").get("/fsm.laportal/Sandpit/SingleQuery.aspx").check(status.is(200))).pause(2)
    .exec(http("do_singleQuery").post("/fsm.laportal/Sandpit/SingleQuery.aspx").body(StringBody("${SingleQueryBody}")).check(status.is(200)))// 10

  val singleQueryBodyFeeder = Iterator.continually(Map("SingleQueryBody" ->
    (random.nextInt(rows.records.length) match { case n => requestBody.format(
    new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.text.SimpleDateFormat("M/d/yyyy").parse(rows.records(n)("ChildDob"))),
    rows.records(n)("ParentNino"),
    rows.records(n)("EligibilityCode"))})))

  def serviceBatchScenario(minBatchSize: Int, maxBatchSize: Int) = {
    val batchBodyFeeder = Iterator.continually({
      val rowcount = minBatchSize + random.nextInt(maxBatchSize - minBatchSize)
      Map("BatchRequestBody" ->
      batchRequestTemplate.format(
        Array.fill(rowcount) {
          val x = rows.records(random.nextInt(rows.records.length))
          batchRequestRecordTemplate.format(
            new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.text.SimpleDateFormat("M/d/yyyy").parse(x("ChildDob"))),
            x("ParentNino"),
            x("EligibilityCode"))
        }.mkString),
      "RowCount" -> rowcount)})

    scenario("Service: Batch Query (%s - %s)".format(minBatchSize, maxBatchSize))
      .feed(batchBodyFeeder)
      .exec(http("Submit a batch query")
        .post("/webservices/sandpit/20160901/OnlineQueryService.svc")
          .header("SOAPAction","\"http://www.dcsf.gov.uk/20090308/OnlineQueryService/SubmitBatchQuery\"")
          .header("Content-Type", "text/xml;charset=UTF-8")
          .body(StringBody("${BatchRequestBody}"))
          .check(status.is(200))
          .check(regex("<a:BatchID>([^<]*)</a:BatchID>").saveAs("batch_id")))
      .asLongAs(session => session("batch_id").asOption[String].isDefined && (session("batch_complete").asOption[String] match {case None => true case Some(n) => n!="0" })) {
        pause(30).exec(http("Check batch query status")
          .post("/webservices/sandpit/20160901/OnlineQueryService.svc")
          .header("SOAPAction","\"http://www.dcsf.gov.uk/20090308/OnlineQueryService/FetchBatchStatus\"")
          .header("Content-Type", "text/xml;charset=UTF-8")
          .body(StringBody(batchStatusTemplate))
          .check(status.is(200))
          .check(regex("<a:BatchStatus>(-?[0-9])</a:BatchStatus>").saveAs("batch_complete"))
          .check(regex("<a:SubmittedDateTime>([^<]*)</a:SubmittedDateTime>").optional.saveAs("batch_start"))
          .check(regex("<a:CompletedDateTime>([^<]*)</a:CompletedDateTime>").optional.saveAs("batch_end"))
        )
      }
      .exec {session =>
        val d = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
        CsvFileWriter.writeLn(
          "Service",
          d.parse(session("batch_start").asOption[String].get),
          session("RowCount").as[Int].get,
          (d.parse(session("batch_end").asOption[String].get).getTime - d.parse(session("batch_start").asOption[String].get).getTime)/1000)
        session
      }
  }

  def serviceSingleScenario = scenario("Service: Single Query")
    .feed(singleQueryBodyFeeder)
    .exec(http("single_query")
      .post("/webservices/sandpit/20160901/OnlineQueryService.svc")
      .header("SOAPAction","\"http://www.dcsf.gov.uk/20090308/OnlineQueryService/SubmitSingleQuery\"")
      .header("Content-Type", "text/xml;charset=UTF-8")
      .body(StringBody("${SingleQueryBody}"))
      .check(status.is(200)))

}

class FullSimulation extends Simulation {
    val singlePerHour = 10000 // equally spread over portal and service
    val smallBatchPerHour = 200 // avg. 200 records, equally spread over portal and
    val mediumBatchPerHour = 550 //avg. 750 records, service only
    val largeBatchPerHour = 60 //avg. 4000 records, service only

    val duration = 5 // in minutes



    setUp(
      //BasicSimulation.portalSingleScenario.inject(rampUsers((duration * singlePerHour) / 120) over duration*60)
      //,BasicSimulation.serviceSingleScenario.inject(rampUsers((duration * singlePerHour) / 120) over duration*60)

      //,BasicSimulation.portalBatchScenario(100,300).inject(rampUsers(duration * smallBatchPerHour / 120) over duration*60)
      //,BasicSimulation.serviceBatchScenario(100,300).inject(rampUsers(duration * smallBatchPerHour / 120) over duration*60)

      BasicSimulation.serviceBatchScenario(500,1000).inject(rampUsers(duration * mediumBatchPerHour / 60) over duration*60)

      ,BasicSimulation.serviceBatchScenario(3500,4500).inject(rampUsers(duration * largeBatchPerHour  / 60) over duration*60)

  ).protocols(BasicSimulation.defaultHttpConf)
}