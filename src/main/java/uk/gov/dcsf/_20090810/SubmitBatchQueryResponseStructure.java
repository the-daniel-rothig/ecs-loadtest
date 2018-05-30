
package uk.gov.dcsf._20090810;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SubmitBatchQueryResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitBatchQueryResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LABatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValidRecords" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InvalidRecords" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QueryValidation" type="{http://www.dcsf.gov.uk/20090810/}ArrayOfValidationResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitBatchQueryResponseStructure", propOrder = {
    "laBatchID",
    "batchID",
    "statusCode",
    "recordCount",
    "validRecords",
    "invalidRecords",
    "queryValidation"
})
public class SubmitBatchQueryResponseStructure {

    @XmlElementRef(name = "LABatchID", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> laBatchID;
    @XmlElement(name = "BatchID", required = true, nillable = true)
    protected String batchID;
    @XmlElement(name = "StatusCode")
    protected int statusCode;
    @XmlElement(name = "RecordCount")
    protected int recordCount;
    @XmlElement(name = "ValidRecords")
    protected int validRecords;
    @XmlElement(name = "InvalidRecords")
    protected int invalidRecords;
    @XmlElement(name = "QueryValidation", required = true, nillable = true)
    protected ArrayOfValidationResult queryValidation;

    /**
     * Gets the value of the laBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLABatchID() {
        return laBatchID;
    }

    /**
     * Sets the value of the laBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLABatchID(JAXBElement<String> value) {
        this.laBatchID = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the validRecords property.
     * 
     */
    public int getValidRecords() {
        return validRecords;
    }

    /**
     * Sets the value of the validRecords property.
     * 
     */
    public void setValidRecords(int value) {
        this.validRecords = value;
    }

    /**
     * Gets the value of the invalidRecords property.
     * 
     */
    public int getInvalidRecords() {
        return invalidRecords;
    }

    /**
     * Sets the value of the invalidRecords property.
     * 
     */
    public void setInvalidRecords(int value) {
        this.invalidRecords = value;
    }

    /**
     * Gets the value of the queryValidation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationResult }
     *     
     */
    public ArrayOfValidationResult getQueryValidation() {
        return queryValidation;
    }

    /**
     * Sets the value of the queryValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationResult }
     *     
     */
    public void setQueryValidation(ArrayOfValidationResult value) {
        this.queryValidation = value;
    }

}
