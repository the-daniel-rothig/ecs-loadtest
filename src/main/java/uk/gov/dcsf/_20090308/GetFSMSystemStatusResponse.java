
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
 *         &lt;element name="GetFSMSystemStatusResult" type="{http://www.dcsf.gov.uk/20090308/}SystemStatusResponse" minOccurs="0"/&gt;
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
    "getFSMSystemStatusResult"
})
@XmlRootElement(name = "GetFSMSystemStatusResponse")
public class GetFSMSystemStatusResponse {

    @XmlElementRef(name = "GetFSMSystemStatusResult", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<SystemStatusResponse> getFSMSystemStatusResult;

    /**
     * Gets the value of the getFSMSystemStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SystemStatusResponse }{@code >}
     *     
     */
    public JAXBElement<SystemStatusResponse> getGetFSMSystemStatusResult() {
        return getFSMSystemStatusResult;
    }

    /**
     * Sets the value of the getFSMSystemStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SystemStatusResponse }{@code >}
     *     
     */
    public void setGetFSMSystemStatusResult(JAXBElement<SystemStatusResponse> value) {
        this.getFSMSystemStatusResult = value;
    }

}
