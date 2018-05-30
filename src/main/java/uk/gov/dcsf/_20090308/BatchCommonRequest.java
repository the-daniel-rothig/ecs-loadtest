
package uk.gov.dcsf._20090308;

import uk.gov.dcsf._20090810.FetchBatchResultsRequestStructure;
import uk.gov.dcsf._20090810.FetchBatchStatusRequestStructure;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BatchCommonRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchCommonRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalAuthorityId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestedServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCommonRequest", propOrder = {
    "systemId",
    "password",
    "localAuthorityId",
    "requestedServiceVersion",
    "batchID"
})
@XmlSeeAlso({
    FetchBatchResultsRequestStructure.class,
    FetchBatchStatusRequestStructure.class,
    SubmitDeleteBatchRequestStructure.class
})
public class BatchCommonRequest {

    @XmlElement(name = "SystemId", required = true, nillable = true)
    protected String systemId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "LocalAuthorityId", required = true, nillable = true)
    protected String localAuthorityId;
    @XmlElement(name = "RequestedServiceVersion", required = true, nillable = true)
    protected String requestedServiceVersion;
    @XmlElement(name = "BatchID", required = true, nillable = true)
    protected String batchID;

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

}
