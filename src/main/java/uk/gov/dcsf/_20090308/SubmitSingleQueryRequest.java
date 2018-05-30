
package uk.gov.dcsf._20090308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitSingleQueryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitSingleQueryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalAuthorityId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestedServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserToQuery" type="{http://www.dcsf.gov.uk/20090308/}QueryData"/&gt;
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "SubmitSingleQueryRequest", propOrder = {
    "systemId",
    "password",
    "localAuthorityId",
    "requestedServiceVersion",
    "userToQuery",
    "sourceType",
    "eligibilityCheckType",
    "serviceType"
})
public class SubmitSingleQueryRequest {

    @XmlElement(name = "SystemId", required = true, nillable = true)
    protected String systemId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "LocalAuthorityId", required = true, nillable = true)
    protected String localAuthorityId;
    @XmlElement(name = "RequestedServiceVersion", required = true, nillable = true)
    protected String requestedServiceVersion;
    @XmlElement(name = "UserToQuery", required = true, nillable = true)
    protected QueryData userToQuery;
    @XmlElement(name = "SourceType", required = true, nillable = true)
    protected String sourceType;
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
     * Gets the value of the userToQuery property.
     * 
     * @return
     *     possible object is
     *     {@link QueryData }
     *     
     */
    public QueryData getUserToQuery() {
        return userToQuery;
    }

    /**
     * Sets the value of the userToQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryData }
     *     
     */
    public void setUserToQuery(QueryData value) {
        this.userToQuery = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
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
