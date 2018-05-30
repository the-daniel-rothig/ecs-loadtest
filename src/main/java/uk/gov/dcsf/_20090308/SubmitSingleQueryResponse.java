
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
 *         &lt;element name="SubmitSingleQueryResult" type="{http://www.dcsf.gov.uk/20090308/}SubmitSingleQueryResult" minOccurs="0"/&gt;
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
    "submitSingleQueryResult"
})
@XmlRootElement(name = "SubmitSingleQueryResponse")
public class SubmitSingleQueryResponse {

    @XmlElementRef(name = "SubmitSingleQueryResult", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<SubmitSingleQueryResult> submitSingleQueryResult;

    /**
     * Gets the value of the submitSingleQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubmitSingleQueryResult }{@code >}
     *     
     */
    public JAXBElement<SubmitSingleQueryResult> getSubmitSingleQueryResult() {
        return submitSingleQueryResult;
    }

    /**
     * Sets the value of the submitSingleQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubmitSingleQueryResult }{@code >}
     *     
     */
    public void setSubmitSingleQueryResult(JAXBElement<SubmitSingleQueryResult> value) {
        this.submitSingleQueryResult = value;
    }

}
