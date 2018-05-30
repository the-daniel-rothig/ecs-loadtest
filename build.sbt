name := "ecs-loadtest-2"

version := "1.0"

scalaVersion := "2.11.11"


enablePlugins(GatlingPlugin)

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.2" % "test",
  "io.gatling"            % "gatling-test-framework"    % "2.2.2" % "test"
)