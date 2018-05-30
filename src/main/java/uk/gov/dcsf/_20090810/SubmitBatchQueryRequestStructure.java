
package uk.gov.dcsf._20090810;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SubmitBatchQueryRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitBatchQueryRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalAuthorityId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestedServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LABatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BatchQueries" type="{http://www.dcsf.gov.uk/20090810/}ArrayOfBatchQuery"/&gt;
 *         &lt;element name="EligibilityCheckType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitBatchQueryRequestStructure", propOrder = {
    "systemId",
    "password",
    "localAuthorityId",
    "requestedServiceVersion",
    "laBatchID",
    "batchQueries",
    "eligibilityCheckType",
    "serviceType"
})
public class SubmitBatchQueryRequestStructure {

    @XmlElement(name = "SystemId", required = true, nillable = true)
    protected String systemId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "LocalAuthorityId", required = true, nillable = true)
    protected String localAuthorityId;
    @XmlElement(name = "RequestedServiceVersion", required = true, nillable = true)
    protected String requestedServiceVersion;
    @XmlElementRef(name = "LABatchID", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> laBatchID;
    @XmlElement(name = "BatchQueries", required = true, nillable = true)
    protected ArrayOfBatchQuery batchQueries;
    @XmlElement(name = "EligibilityCheckType", required = true, nillable = true)
    protected String eligibilityCheckType;
    @XmlElement(name = "ServiceType", required = true, nillable = true)
    protected String serviceType;

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Gets the value of the requestedServiceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedServiceVersion() {
        return requestedServiceVersion;
    }

    /**
     * Sets the value of the requestedServiceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedServiceVersion(String value) {
        this.requestedServiceVersion = value;
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
     * Gets the value of the batchQueries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchQuery }
     *     
     */
    public ArrayOfBatchQuery getBatchQueries() {
        return batchQueries;
    }

    /**
     * Sets the value of the batchQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchQuery }
     *     
     */
    public void setBatchQueries(ArrayOfBatchQuery value) {
        this.batchQueries = value;
    }

    /**
     * Gets the value of the eligibilityCheckType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCheckType() {
        return eligibilityCheckType;
    }

    /**
     * Sets the value of the eligibilityCheckType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCheckType(String value) {
        this.eligibilityCheckType = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

}
