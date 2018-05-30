
package uk.gov.dcsf._20090810;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BatchStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchStatusItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BatchStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocalAuthorityId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LABatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubmittedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CompletedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExpiryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RowCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalMatched" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchStatusItem", propOrder = {
    "batchID",
    "batchStatus",
    "localAuthorityId",
    "laBatchID",
    "submittedDateTime",
    "completedDateTime",
    "expiryDateTime",
    "rowCount",
    "totalMatched"
})
public class BatchStatusItem {

    @XmlElement(name = "BatchID", required = true, nillable = true)
    protected String batchID;
    @XmlElement(name = "BatchStatus", required = true, type = Integer.class, nillable = true)
    protected Integer batchStatus;
    @XmlElement(name = "LocalAuthorityId", required = true, nillable = true)
    protected String localAuthorityId;
    @XmlElementRef(name = "LABatchID", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> laBatchID;
    @XmlElement(name = "SubmittedDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedDateTime;
    @XmlElement(name = "CompletedDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedDateTime;
    @XmlElement(name = "ExpiryDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDateTime;
    @XmlElement(name = "RowCount", required = true, type = Integer.class, nillable = true)
    protected Integer rowCount;
    @XmlElement(name = "TotalMatched", required = true, type = Integer.class, nillable = true)
    protected Integer totalMatched;

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
     * Gets the value of the batchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchStatus() {
        return batchStatus;
    }

    /**
     * Sets the value of the batchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchStatus(Integer value) {
        this.batchStatus = value;
    }

    /**
     * Gets the value of the localAuthorityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAuthorityId() {
        return localAuthorityId;
    }

    /**
     * Sets the value of the localAuthorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAuthorityId(String value) {
        this.localAuthorityId = value;
    }

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
     * Gets the value of the submittedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedDateTime() {
        return submittedDateTime;
    }

    /**
     * Sets the value of the submittedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmittedDateTime(XMLGregorianCalendar value) {
        this.submittedDateTime = value;
    }

    /**
     * Gets the value of the completedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * Sets the value of the completedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDateTime(XMLGregorianCalendar value) {
        this.completedDateTime = value;
    }

    /**
     * Gets the value of the expiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Sets the value of the expiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateTime(XMLGregorianCalendar value) {
        this.expiryDateTime = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowCount(Integer value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the totalMatched property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMatched() {
        return totalMatched;
    }

    /**
     * Sets the value of the totalMatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMatched(Integer value) {
        this.totalMatched = value;
    }

}
