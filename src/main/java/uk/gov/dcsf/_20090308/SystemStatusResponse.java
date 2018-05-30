
package uk.gov.dcsf._20090308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SystemStatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatusResponse", propOrder = {
    "returnCode",
    "systemStatusCode"
})
public class SystemStatusResponse {

    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElement(name = "SystemStatusCode")
    protected int systemStatusCode;

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the systemStatusCode property.
     * 
     */
    public int getSystemStatusCode() {
        return systemStatusCode;
    }

    /**
     * Sets the value of the systemStatusCode property.
     * 
     */
    public void setSystemStatusCode(int value) {
        this.systemStatusCode = value;
    }

}
