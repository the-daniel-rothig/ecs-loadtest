
package uk.gov.dcsf._20090810;

import uk.gov.dcsf._20090308.QueryData;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.gov.dcsf._20090810 package. 
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

    private final static QName _SubmitBatchQueryRequestStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "SubmitBatchQueryRequestStructure");
    private final static QName _ArrayOfBatchQuery_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "ArrayOfBatchQuery");
    private final static QName _BatchQuery_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "BatchQuery");
    private final static QName _SubmitBatchQueryResponseStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "SubmitBatchQueryResponseStructure");
    private final static QName _ArrayOfValidationResult_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "ArrayOfValidationResult");
    private final static QName _ValidationResult_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "ValidationResult");
    private final static QName _FetchBatchResultsRequestStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "FetchBatchResultsRequestStructure");
    private final static QName _FetchBatchResultsResponseStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "FetchBatchResultsResponseStructure");
    private final static QName _ArrayOfBatchResult_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "ArrayOfBatchResult");
    private final static QName _BatchResult_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "BatchResult");
    private final static QName _FetchBatchStatusRequestStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "FetchBatchStatusRequestStructure");
    private final static QName _FetchBatchStatusResponseStructure_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "FetchBatchStatusResponseStructure");
    private final static QName _ArrayOfBatchStatusItem_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "ArrayOfBatchStatusItem");
    private final static QName _BatchStatusItem_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "BatchStatusItem");
    private final static QName _BatchStatusItemLABatchID_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "LABatchID");
    private final static QName _BatchResultValidityStartDate_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "ValidityStartDate");
    private final static QName _BatchResultValidityEndDate_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "ValidityEndDate");
    private final static QName _BatchResultGracePeriodEndDate_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "GracePeriodEndDate");
    private final static QName _FetchBatchResultsResponseStructureBatchResults_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "BatchResults");
    private final static QName _ValidationResultRowID_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "RowID");
    private final static QName _BatchQueryUserToQuery_QNAME = new QName("http://www.dcsf.gov.uk/20090810/", "UserToQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.gov.dcsf._20090810
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitBatchQueryRequestStructure }
     * 
     */
    public SubmitBatchQueryRequestStructure createSubmitBatchQueryRequestStructure() {
        return new SubmitBatchQueryRequestStructure();
    }

    /**
     * Create an instance of {@link ArrayOfBatchQuery }
     * 
     */
    public ArrayOfBatchQuery createArrayOfBatchQuery() {
        return new ArrayOfBatchQuery();
    }

    /**
     * Create an instance of {@link BatchQuery }
     * 
     */
    public BatchQuery createBatchQuery() {
        return new BatchQuery();
    }

    /**
     * Create an instance of {@link SubmitBatchQueryResponseStructure }
     * 
     */
    public SubmitBatchQueryResponseStructure createSubmitBatchQueryResponseStructure() {
        return new SubmitBatchQueryResponseStructure();
    }

    /**
     * Create an instance of {@link ArrayOfValidationResult }
     * 
     */
    public ArrayOfValidationResult createArrayOfValidationResult() {
        return new ArrayOfValidationResult();
    }

    /**
     * Create an instance of {@link ValidationResult }
     * 
     */
    public ValidationResult createValidationResult() {
        return new ValidationResult();
    }

    /**
     * Create an instance of {@link FetchBatchResultsRequestStructure }
     * 
     */
    public FetchBatchResultsRequestStructure createFetchBatchResultsRequestStructure() {
        return new FetchBatchResultsRequestStructure();
    }

    /**
     * Create an instance of {@link FetchBatchResultsResponseStructure }
     * 
     */
    public FetchBatchResultsResponseStructure createFetchBatchResultsResponseStructure() {
        return new FetchBatchResultsResponseStructure();
    }

    /**
     * Create an instance of {@link ArrayOfBatchResult }
     * 
     */
    public ArrayOfBatchResult createArrayOfBatchResult() {
        return new ArrayOfBatchResult();
    }

    /**
     * Create an instance of {@link BatchResult }
     * 
     */
    public BatchResult createBatchResult() {
        return new BatchResult();
    }

    /**
     * Create an instance of {@link FetchBatchStatusRequestStructure }
     * 
     */
    public FetchBatchStatusRequestStructure createFetchBatchStatusRequestStructure() {
        return new FetchBatchStatusRequestStructure();
    }

    /**
     * Create an instance of {@link FetchBatchStatusResponseStructure }
     * 
     */
    public FetchBatchStatusResponseStructure createFetchBatchStatusResponseStructure() {
        return new FetchBatchStatusResponseStructure();
    }

    /**
     * Create an instance of {@link ArrayOfBatchStatusItem }
     * 
     */
    public ArrayOfBatchStatusItem createArrayOfBatchStatusItem() {
        return new ArrayOfBatchStatusItem();
    }

    /**
     * Create an instance of {@link BatchStatusItem }
     * 
     */
    public BatchStatusItem createBatchStatusItem() {
        return new BatchStatusItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitBatchQueryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "SubmitBatchQueryRequestStructure")
    public JAXBElement<SubmitBatchQueryRequestStructure> createSubmitBatchQueryRequestStructure(SubmitBatchQueryRequestStructure value) {
        return new JAXBElement<SubmitBatchQueryRequestStructure>(_SubmitBatchQueryRequestStructure_QNAME, SubmitBatchQueryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "ArrayOfBatchQuery")
    public JAXBElement<ArrayOfBatchQuery> createArrayOfBatchQuery(ArrayOfBatchQuery value) {
        return new JAXBElement<ArrayOfBatchQuery>(_ArrayOfBatchQuery_QNAME, ArrayOfBatchQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "BatchQuery")
    public JAXBElement<BatchQuery> createBatchQuery(BatchQuery value) {
        return new JAXBElement<BatchQuery>(_BatchQuery_QNAME, BatchQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitBatchQueryResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "SubmitBatchQueryResponseStructure")
    public JAXBElement<SubmitBatchQueryResponseStructure> createSubmitBatchQueryResponseStructure(SubmitBatchQueryResponseStructure value) {
        return new JAXBElement<SubmitBatchQueryResponseStructure>(_SubmitBatchQueryResponseStructure_QNAME, SubmitBatchQueryResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "ArrayOfValidationResult")
    public JAXBElement<ArrayOfValidationResult> createArrayOfValidationResult(ArrayOfValidationResult value) {
        return new JAXBElement<ArrayOfValidationResult>(_ArrayOfValidationResult_QNAME, ArrayOfValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "ValidationResult")
    public JAXBElement<ValidationResult> createValidationResult(ValidationResult value) {
        return new JAXBElement<ValidationResult>(_ValidationResult_QNAME, ValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchResultsRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "FetchBatchResultsRequestStructure")
    public JAXBElement<FetchBatchResultsRequestStructure> createFetchBatchResultsRequestStructure(FetchBatchResultsRequestStructure value) {
        return new JAXBElement<FetchBatchResultsRequestStructure>(_FetchBatchResultsRequestStructure_QNAME, FetchBatchResultsRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchResultsResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "FetchBatchResultsResponseStructure")
    public JAXBElement<FetchBatchResultsResponseStructure> createFetchBatchResultsResponseStructure(FetchBatchResultsResponseStructure value) {
        return new JAXBElement<FetchBatchResultsResponseStructure>(_FetchBatchResultsResponseStructure_QNAME, FetchBatchResultsResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "ArrayOfBatchResult")
    public JAXBElement<ArrayOfBatchResult> createArrayOfBatchResult(ArrayOfBatchResult value) {
        return new JAXBElement<ArrayOfBatchResult>(_ArrayOfBatchResult_QNAME, ArrayOfBatchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "BatchResult")
    public JAXBElement<BatchResult> createBatchResult(BatchResult value) {
        return new JAXBElement<BatchResult>(_BatchResult_QNAME, BatchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchStatusRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "FetchBatchStatusRequestStructure")
    public JAXBElement<FetchBatchStatusRequestStructure> createFetchBatchStatusRequestStructure(FetchBatchStatusRequestStructure value) {
        return new JAXBElement<FetchBatchStatusRequestStructure>(_FetchBatchStatusRequestStructure_QNAME, FetchBatchStatusRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchBatchStatusResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "FetchBatchStatusResponseStructure")
    public JAXBElement<FetchBatchStatusResponseStructure> createFetchBatchStatusResponseStructure(FetchBatchStatusResponseStructure value) {
        return new JAXBElement<FetchBatchStatusResponseStructure>(_FetchBatchStatusResponseStructure_QNAME, FetchBatchStatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchStatusItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "ArrayOfBatchStatusItem")
    public JAXBElement<ArrayOfBatchStatusItem> createArrayOfBatchStatusItem(ArrayOfBatchStatusItem value) {
        return new JAXBElement<ArrayOfBatchStatusItem>(_ArrayOfBatchStatusItem_QNAME, ArrayOfBatchStatusItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchStatusItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "BatchStatusItem")
    public JAXBElement<BatchStatusItem> createBatchStatusItem(BatchStatusItem value) {
        return new JAXBElement<BatchStatusItem>(_BatchStatusItem_QNAME, BatchStatusItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "LABatchID", scope = BatchStatusItem.class)
    public JAXBElement<String> createBatchStatusItemLABatchID(String value) {
        return new JAXBElement<String>(_BatchStatusItemLABatchID_QNAME, String.class, BatchStatusItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "ValidityStartDate", scope = BatchResult.class)
    public JAXBElement<String> createBatchResultValidityStartDate(String value) {
        return new JAXBElement<String>(_BatchResultValidityStartDate_QNAME, String.class, BatchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "ValidityEndDate", scope = BatchResult.class)
    public JAXBElement<String> createBatchResultValidityEndDate(String value) {
        return new JAXBElement<String>(_BatchResultValidityEndDate_QNAME, String.class, BatchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "GracePeriodEndDate", scope = BatchResult.class)
    public JAXBElement<String> createBatchResultGracePeriodEndDate(String value) {
        return new JAXBElement<String>(_BatchResultGracePeriodEndDate_QNAME, String.class, BatchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "LABatchID", scope = FetchBatchResultsResponseStructure.class)
    public JAXBElement<String> createFetchBatchResultsResponseStructureLABatchID(String value) {
        return new JAXBElement<String>(_BatchStatusItemLABatchID_QNAME, String.class, FetchBatchResultsResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "BatchResults", scope = FetchBatchResultsResponseStructure.class)
    public JAXBElement<ArrayOfBatchResult> createFetchBatchResultsResponseStructureBatchResults(ArrayOfBatchResult value) {
        return new JAXBElement<ArrayOfBatchResult>(_FetchBatchResultsResponseStructureBatchResults_QNAME, ArrayOfBatchResult.class, FetchBatchResultsResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "RowID", scope = ValidationResult.class)
    public JAXBElement<String> createValidationResultRowID(String value) {
        return new JAXBElement<String>(_ValidationResultRowID_QNAME, String.class, ValidationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "LABatchID", scope = SubmitBatchQueryResponseStructure.class)
    public JAXBElement<String> createSubmitBatchQueryResponseStructureLABatchID(String value) {
        return new JAXBElement<String>(_BatchStatusItemLABatchID_QNAME, String.class, SubmitBatchQueryResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "RowID", scope = BatchQuery.class)
    public JAXBElement<String> createBatchQueryRowID(String value) {
        return new JAXBElement<String>(_ValidationResultRowID_QNAME, String.class, BatchQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "UserToQuery", scope = BatchQuery.class)
    public JAXBElement<QueryData> createBatchQueryUserToQuery(QueryData value) {
        return new JAXBElement<QueryData>(_BatchQueryUserToQuery_QNAME, QueryData.class, BatchQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dcsf.gov.uk/20090810/", name = "LABatchID", scope = SubmitBatchQueryRequestStructure.class)
    public JAXBElement<String> createSubmitBatchQueryRequestStructureLABatchID(String value) {
        return new JAXBElement<String>(_BatchStatusItemLABatchID_QNAME, String.class, SubmitBatchQueryRequestStructure.class, value);
    }

}
