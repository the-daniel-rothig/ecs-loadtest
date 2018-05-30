
package uk.gov.dcsf._20090308;

import uk.gov.dcsf._20090810.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.gov.dcsf._20090308 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SubmitSingleQueryRequest_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SubmitSingleQueryRequest");
    private final static QName _QueryData_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "QueryData");
    private final static QName _ArrayOfSubscriber_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "ArrayOfSubscriber");
    private final static QName _Subscriber_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "Subscriber");
    private final static QName _SubmitSingleQueryResult_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SubmitSingleQueryResult");
    private final static QName _BatchCommonRequest_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "BatchCommonRequest");
    private final static QName _SubmitDeleteBatchRequestStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SubmitDeleteBatchRequestStructure");
    private final static QName _SubmitDeleteBatchResponseStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SubmitDeleteBatchResponseStructure");
    private final static QName _SystemStatusWithAuthenticationRequest_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SystemStatusWithAuthenticationRequest");
    private final static QName _SystemStatusResponse_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SystemStatusResponse");
    private final static QName _SubmitSingleQueryRequestInput_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "requestInput");
    private final static QName _SubmitBatchQueryResponseSubmitBatchQueryResult_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SubmitBatchQueryResult");
    private final static QName _FetchBatchResultsResponseFetchBatchResultsResult_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "FetchBatchResultsResult");
    private final static QName _FetchBatchStatusResponseFetchBatchStatusResult_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "FetchBatchStatusResult");
    private final static QName _SubmitDeleteBatchResponseSubmitDeleteBatchResult_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "SubmitDeleteBatchResult");
    private final static QName _GetFSMSystemStatusDetails_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "details");
    private final static QName _GetFSMSystemStatusResponseGetFSMSystemStatusResult_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "GetFSMSystemStatusResult");
    private final static QName _SubmitDeleteBatchResponseStructureLABatchID_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "LABatchID");
    private final static QName _SubmitSingleQueryResultValidityStartDate_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "ValidityStartDate");
    private final static QName _SubmitSingleQueryResultValidityEndDate_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "ValidityEndDate");
    private final static QName _SubmitSingleQueryResultGracePeriodEndDate_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "GracePeriodEndDate");
    private final static QName _QueryDataSurname_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "Surname");
    private final static QName _QueryDataNiNo_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "NiNo");
    private final static QName _QueryDataNASS_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "NASS");
    private final static QName _QueryDataSubscribers_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "Subscribers");
    private final static QName _QueryDataDern_QNAME = new QName("http://www.dcsf.gov.uk/20090308/", "Dern");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.gov.dcsf._20090308
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitSingleQuery }
     * 
     */
    public SubmitSingleQuery createSubmitSingleQuery() {
        return new SubmitSingleQuery();
    }

    /**
     * Create an instance of {@link SubmitSingleQueryRequest }
     * 
     */
    public SubmitSingleQueryRequest createSubmitSingleQueryRequest() {
        return new SubmitSingleQueryRequest();
    }

    /**
     * Create an instance of {@link QueryData }
     * 
     */
    public QueryData createQueryData() {
        return new QueryData();
    }

    /**
     * Create an instance of {@link ArrayOfSubscriber }
     * 
     */
    public ArrayOfSubscriber createArrayOfSubscriber() {
        return new ArrayOfSubscriber();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link SubmitSingleQueryResponse }
     * 
     */
    public SubmitSingleQueryResponse createSubmitSingleQueryResponse() {
        return new SubmitSingleQueryResponse();
    }

    /**
     * Create an instance of {@link SubmitSingleQueryResult }
     * 
     */
    public SubmitSingleQueryResult createSubmitSingleQueryResult() {
        return new SubmitSingleQueryResult();
    }

    /**
     * Create an instance of {@link SubmitBatchQuery }
     * 
     */
    public SubmitBatchQuery createSubmitBatchQuery() {
        return new SubmitBatchQuery();
    }

    /**
     * Create an instance of {@link SubmitBatchQueryResponse }
     * 
     */
    public SubmitBatchQueryResponse createSubmitBatchQueryResponse() {
        return new SubmitBatchQueryResponse();
    }

    /**
     * Create an instance of {@link FetchBatchResults }
     * 
     */
    public FetchBatchResults createFetchBatchResults() {
        return new FetchBatchResults();
    }

    /**
     * Create an instance of {@link BatchCommonRequest }
     * 
     */
    public BatchCommonRequest createBatchCommonRequest() {
        return new BatchCommonRequest();
    }

    /**
     * Create an instance of {@link FetchBatchResultsResponse }
     * 
     */
    public FetchBatchResultsResponse createFetchBatchResultsResponse() {
        return new FetchBatchResultsResponse();
    }

    /**
     * Create an instance of {@link FetchBatchStatus }
     * 
     */
    public FetchBatchStatus createFetchBatchStatus() {
        return new FetchBatchStatus();
    }

    /**
     * Create an instance of {@link FetchBatchStatusResponse }
     * 
     */
    public FetchBatchStatusResponse createFetchBatchStatusResponse() {
        return new FetchBatchStatusResponse();
    }

    /**
     * Create an instance of {@link SubmitDeleteBatch }
     * 
     */
    public SubmitDeleteBatch createSubmitDeleteBatch() {
        return new SubmitDeleteBatch();
    }

    /**
     * Create an instance of {@link SubmitDeleteBatchRequestStructure }
     * 
     */
    public SubmitDeleteBatchRequestStructure createSubmitDeleteBatchRequestStructure() {
        return new SubmitDeleteBatchRequestStructure();
    }

    /**
     * Create an instance of {@link SubmitDeleteBatchResponse }
     * 
     */
    public SubmitDeleteBatchResponse createSubmitDeleteBatchResponse() {
        return new SubmitDeleteBatchResponse();
    }

    /**
     * Create an instance of {@link SubmitDeleteBatchResponseStructure }
     * 
     */
    public SubmitDeleteBatchResponseStructure createSubmitDeleteBatchResponseStructure() {
        return new SubmitDeleteBatchResponseStructure();
    }

    /**
     * Create an instance of {@link GetFSMSystemStatus }
     * 
     */
    public GetFSMSystemStatus createGetFSMSystemStatus() {
        return new GetFSMSystemStatus();
    }

    /**
     * Create an instance of {@link SystemStatusWithAuthenticationRequest }
     * 
     */
    public SystemStatusWithAuthenticationRequest createSystemStatusWithAuthenticationRequest() {
        return new SystemStatusWithAuthenticationRequest();
    }

    /**
     * Create an instance of {@link GetFSMSystemStatusResponse }
     * 
     */
    public GetFSMSystemStatusResponse createGetFSMSystemStatusResponse() {
        return new GetFSMSystemStatusResponse();
    }

    /**
     * Create an instance of {@link SystemStatusResponse }
     * 
     */
    public SystemStatusResponse createSystemStatusResponse() {
        return new SystemStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSingleQueryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SubmitSingleQueryRequest")
    public JAXBElement<SubmitSingleQueryRequest> createSubmitSingleQueryRequest(SubmitSingleQueryRequest value) {
        return new JAXBElement<SubmitSingleQueryRequest>(_SubmitSingleQueryRequest_QNAME, SubmitSingleQueryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "QueryData")
    public JAXBElement<QueryData> createQueryData(QueryData value) {
        return new JAXBElement<QueryData>(_QueryData_QNAME, QueryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "ArrayOfSubscriber")
    public JAXBElement<ArrayOfSubscriber> createArrayOfSubscriber(ArrayOfSubscriber value) {
        return new JAXBElement<ArrayOfSubscriber>(_ArrayOfSubscriber_QNAME, ArrayOfSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "Subscriber")
    public JAXBElement<Subscriber> createSubscriber(Subscriber value) {
        return new JAXBElement<Subscriber>(_Subscriber_QNAME, Subscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSingleQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SubmitSingleQueryResult")
    public JAXBElement<SubmitSingleQueryResult> createSubmitSingleQueryResult(SubmitSingleQueryResult value) {
        return new JAXBElement<SubmitSingleQueryResult>(_SubmitSingleQueryResult_QNAME, SubmitSingleQueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchCommonRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "BatchCommonRequest")
    public JAXBElement<BatchCommonRequest> createBatchCommonRequest(BatchCommonRequest value) {
        return new JAXBElement<BatchCommonRequest>(_BatchCommonRequest_QNAME, BatchCommonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitDeleteBatchRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SubmitDeleteBatchRequestStructure")
    public JAXBElement<SubmitDeleteBatchRequestStructure> createSubmitDeleteBatchRequestStructure(SubmitDeleteBatchRequestStructure value) {
        return new JAXBElement<SubmitDeleteBatchRequestStructure>(_SubmitDeleteBatchRequestStructure_QNAME, SubmitDeleteBatchRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitDeleteBatchResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SubmitDeleteBatchResponseStructure")
    public JAXBElement<SubmitDeleteBatchResponseStructure> createSubmitDeleteBatchResponseStructure(SubmitDeleteBatchResponseStructure value) {
        return new JAXBElement<SubmitDeleteBatchResponseStructure>(_SubmitDeleteBatchResponseStructure_QNAME, SubmitDeleteBatchResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemStatusWithAuthenticationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SystemStatusWithAuthenticationRequest")
    public JAXBElement<SystemStatusWithAuthenticationRequest> createSystemStatusWithAuthenticationRequest(SystemStatusWithAuthenticationRequest value) {
        return new JAXBElement<SystemStatusWithAuthenticationRequest>(_SystemStatusWithAuthenticationRequest_QNAME, SystemStatusWithAuthenticationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SystemStatusResponse")
    public JAXBElement<SystemStatusResponse> createSystemStatusResponse(SystemStatusResponse value) {
        return new JAXBElement<SystemStatusResponse>(_SystemStatusResponse_QNAME, SystemStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSingleQueryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "requestInput", scope = SubmitSingleQuery.class)
    public JAXBElement<SubmitSingleQueryRequest> createSubmitSingleQueryRequestInput(SubmitSingleQueryRequest value) {
        return new JAXBElement<SubmitSingleQueryRequest>(_SubmitSingleQueryRequestInput_QNAME, SubmitSingleQueryRequest.class, SubmitSingleQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSingleQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SubmitSingleQueryResult", scope = SubmitSingleQueryResponse.class)
    public JAXBElement<SubmitSingleQueryResult> createSubmitSingleQueryResponseSubmitSingleQueryResult(SubmitSingleQueryResult value) {
        return new JAXBElement<SubmitSingleQueryResult>(_SubmitSingleQueryResult_QNAME, SubmitSingleQueryResult.class, SubmitSingleQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitBatchQueryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "requestInput", scope = SubmitBatchQuery.class)
    public JAXBElement<SubmitBatchQueryRequestStructure> createSubmitBatchQueryRequestInput(SubmitBatchQueryRequestStructure value) {
        return new JAXBElement<SubmitBatchQueryRequestStructure>(_SubmitSingleQueryRequestInput_QNAME, SubmitBatchQueryRequestStructure.class, SubmitBatchQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitBatchQueryResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SubmitBatchQueryResult", scope = SubmitBatchQueryResponse.class)
    public JAXBElement<SubmitBatchQueryResponseStructure> createSubmitBatchQueryResponseSubmitBatchQueryResult(SubmitBatchQueryResponseStructure value) {
        return new JAXBElement<SubmitBatchQueryResponseStructure>(_SubmitBatchQueryResponseSubmitBatchQueryResult_QNAME, SubmitBatchQueryResponseStructure.class, SubmitBatchQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchResultsRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "requestInput", scope = FetchBatchResults.class)
    public JAXBElement<FetchBatchResultsRequestStructure> createFetchBatchResultsRequestInput(FetchBatchResultsRequestStructure value) {
        return new JAXBElement<FetchBatchResultsRequestStructure>(_SubmitSingleQueryRequestInput_QNAME, FetchBatchResultsRequestStructure.class, FetchBatchResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchResultsResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "FetchBatchResultsResult", scope = FetchBatchResultsResponse.class)
    public JAXBElement<FetchBatchResultsResponseStructure> createFetchBatchResultsResponseFetchBatchResultsResult(FetchBatchResultsResponseStructure value) {
        return new JAXBElement<FetchBatchResultsResponseStructure>(_FetchBatchResultsResponseFetchBatchResultsResult_QNAME, FetchBatchResultsResponseStructure.class, FetchBatchResultsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchStatusRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "requestInput", scope = FetchBatchStatus.class)
    public JAXBElement<FetchBatchStatusRequestStructure> createFetchBatchStatusRequestInput(FetchBatchStatusRequestStructure value) {
        return new JAXBElement<FetchBatchStatusRequestStructure>(_SubmitSingleQueryRequestInput_QNAME, FetchBatchStatusRequestStructure.class, FetchBatchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchStatusResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "FetchBatchStatusResult", scope = FetchBatchStatusResponse.class)
    public JAXBElement<FetchBatchStatusResponseStructure> createFetchBatchStatusResponseFetchBatchStatusResult(FetchBatchStatusResponseStructure value) {
        return new JAXBElement<FetchBatchStatusResponseStructure>(_FetchBatchStatusResponseFetchBatchStatusResult_QNAME, FetchBatchStatusResponseStructure.class, FetchBatchStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitDeleteBatchRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "requestInput", scope = SubmitDeleteBatch.class)
    public JAXBElement<SubmitDeleteBatchRequestStructure> createSubmitDeleteBatchRequestInput(SubmitDeleteBatchRequestStructure value) {
        return new JAXBElement<SubmitDeleteBatchRequestStructure>(_SubmitSingleQueryRequestInput_QNAME, SubmitDeleteBatchRequestStructure.class, SubmitDeleteBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitDeleteBatchResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "SubmitDeleteBatchResult", scope = SubmitDeleteBatchResponse.class)
    public JAXBElement<SubmitDeleteBatchResponseStructure> createSubmitDeleteBatchResponseSubmitDeleteBatchResult(SubmitDeleteBatchResponseStructure value) {
        return new JAXBElement<SubmitDeleteBatchResponseStructure>(_SubmitDeleteBatchResponseSubmitDeleteBatchResult_QNAME, SubmitDeleteBatchResponseStructure.class, SubmitDeleteBatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemStatusWithAuthenticationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "details", scope = GetFSMSystemStatus.class)
    public JAXBElement<SystemStatusWithAuthenticationRequest> createGetFSMSystemStatusDetails(SystemStatusWithAuthenticationRequest value) {
        return new JAXBElement<SystemStatusWithAuthenticationRequest>(_GetFSMSystemStatusDetails_QNAME, SystemStatusWithAuthenticationRequest.class, GetFSMSystemStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "GetFSMSystemStatusResult", scope = GetFSMSystemStatusResponse.class)
    public JAXBElement<SystemStatusResponse> createGetFSMSystemStatusResponseGetFSMSystemStatusResult(SystemStatusResponse value) {
        return new JAXBElement<SystemStatusResponse>(_GetFSMSystemStatusResponseGetFSMSystemStatusResult_QNAME, SystemStatusResponse.class, GetFSMSystemStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "LABatchID", scope = SubmitDeleteBatchResponseStructure.class)
    public JAXBElement<String> createSubmitDeleteBatchResponseStructureLABatchID(String value) {
        return new JAXBElement<String>(_SubmitDeleteBatchResponseStructureLABatchID_QNAME, String.class, SubmitDeleteBatchResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "ValidityStartDate", scope = SubmitSingleQueryResult.class)
    public JAXBElement<String> createSubmitSingleQueryResultValidityStartDate(String value) {
        return new JAXBElement<String>(_SubmitSingleQueryResultValidityStartDate_QNAME, String.class, SubmitSingleQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "ValidityEndDate", scope = SubmitSingleQueryResult.class)
    public JAXBElement<String> createSubmitSingleQueryResultValidityEndDate(String value) {
        return new JAXBElement<String>(_SubmitSingleQueryResultValidityEndDate_QNAME, String.class, SubmitSingleQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "GracePeriodEndDate", scope = SubmitSingleQueryResult.class)
    public JAXBElement<String> createSubmitSingleQueryResultGracePeriodEndDate(String value) {
        return new JAXBElement<String>(_SubmitSingleQueryResultGracePeriodEndDate_QNAME, String.class, SubmitSingleQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "Surname", scope = QueryData.class)
    public JAXBElement<String> createQueryDataSurname(String value) {
        return new JAXBElement<String>(_QueryDataSurname_QNAME, String.class, QueryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "NiNo", scope = QueryData.class)
    public JAXBElement<String> createQueryDataNiNo(String value) {
        return new JAXBElement<String>(_QueryDataNiNo_QNAME, String.class, QueryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "NASS", scope = QueryData.class)
    public JAXBElement<String> createQueryDataNASS(String value) {
        return new JAXBElement<String>(_QueryDataNASS_QNAME, String.class, QueryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "Subscribers", scope = QueryData.class)
    public JAXBElement<ArrayOfSubscriber> createQueryDataSubscribers(ArrayOfSubscriber value) {
        return new JAXBElement<ArrayOfSubscriber>(_QueryDataSubscribers_QNAME, ArrayOfSubscriber.class, QueryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090308/", name = "Dern", scope = QueryData.class)
    public JAXBElement<String> createQueryDataDern(String value) {
        return new JAXBElement<String>(_QueryDataDern_QNAME, String.class, QueryData.class, value);
    }

}
