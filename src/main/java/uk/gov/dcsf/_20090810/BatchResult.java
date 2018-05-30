
package uk.gov.dcsf._20090810;

import uk.gov.dcsf._20090308.QueryData;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RowID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QueryItem" type="{http://www.dcsf.gov.uk/20090308/}QueryData"/&gt;
 *         &lt;element name="Eligibility" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValidityStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidityEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GracePeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResult", propOrder = {
    "rowID",
    "queryItem",
    "eligibility",
    "validityStartDate",
    "validityEndDate",
    "gracePeriodEndDate"
})
public class BatchResult {

    @XmlElement(name = "RowID", required = true, nillable = true)
    protected String rowID;
    @XmlElement(name = "QueryItem", required = true, nillable = true)
    protected QueryData queryItem;
    @XmlElement(name = "Eligibility")
    protected int eligibility;
    @XmlElementRef(name = "ValidityStartDate", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validityStartDate;
    @XmlElementRef(name = "ValidityEndDate", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validityEndDate;
    @XmlElementRef(name = "GracePeriodEndDate", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gracePeriodEndDate;

    /**
     * Gets the value of the rowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowID() {
        return rowID;
    }

    /**
     * Sets the value of the rowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowID(String value) {
        this.rowID = value;
    }

    /**
     * Gets the value of the queryItem property.
     * 
     * @return
     *     possible object is
     *     {@link QueryData }
     *     
     */
    public QueryData getQueryItem() {
        return queryItem;
    }

    /**
     * Sets the value of the queryItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryData }
     *     
     */
    public void setQueryItem(QueryData value) {
        this.queryItem = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     */
    public int getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     */
    public void setEligibility(int value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the validityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * Sets the value of the validityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidityStartDate(JAXBElement<String> value) {
        this.validityStartDate = value;
    }

    /**
     * Gets the value of the validityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidityEndDate() {
        return validityEndDate;
    }

    /**
     * Sets the value of the validityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidityEndDate(JAXBElement<String> value) {
        this.validityEndDate = value;
    }

    /**
     * Gets the value of the gracePeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGracePeriodEndDate() {
        return gracePeriodEndDate;
    }

    /**
     * Sets the value of the gracePeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGracePeriodEndDate(JAXBElement<String> value) {
        this.gracePeriodEndDate = value;
    }

}
