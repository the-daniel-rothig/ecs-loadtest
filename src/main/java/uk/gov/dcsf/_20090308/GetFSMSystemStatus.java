
package uk.gov.dcsf._20090308;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="details" type="{http://www.dcsf.gov.uk/20090308/}SystemStatusWithAuthenticationRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "details"
})
@XmlRootElement(name = "GetFSMSystemStatus")
public class GetFSMSystemStatus {

    @XmlElementRef(name = "details", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<SystemStatusWithAuthenticationRequest> details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SystemStatusWithAuthenticationRequest }{@code >}
     *     
     */
    public JAXBElement<SystemStatusWithAuthenticationRequest> getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SystemStatusWithAuthenticationRequest }{@code >}
     *     
     */
    public void setDetails(JAXBElement<SystemStatusWithAuthenticationRequest> value) {
        this.details = value;
    }

}
