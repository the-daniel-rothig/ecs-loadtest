
package uk.gov.dcsf._20090308;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SubmitSingleQueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitSingleQueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "SubmitSingleQueryResult", propOrder = {
    "eligibilityStatus",
    "errorCode",
    "validityStartDate",
    "validityEndDate",
    "gracePeriodEndDate"
})
public class SubmitSingleQueryResult {

    @XmlElement(name = "EligibilityStatus")
    protected int eligibilityStatus;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElementRef(name = "ValidityStartDate", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validityStartDate;
    @XmlElementRef(name = "ValidityEndDate", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validityEndDate;
    @XmlElementRef(name = "GracePeriodEndDate", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gracePeriodEndDate;

    /**
     * Gets the value of the eligibilityStatus property.
     * 
     */
    public int getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Sets the value of the eligibilityStatus property.
     * 
     */
    public void setEligibilityStatus(int value) {
        this.eligibilityStatus = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
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
