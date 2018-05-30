
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
 *         &lt;element name="SubmitDeleteBatchResult" type="{http://www.dcsf.gov.uk/20090308/}SubmitDeleteBatchResponseStructure" minOccurs="0"/&gt;
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
    "submitDeleteBatchResult"
})
@XmlRootElement(name = "SubmitDeleteBatchResponse")
public class SubmitDeleteBatchResponse {

    @XmlElementRef(name = "SubmitDeleteBatchResult", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<SubmitDeleteBatchResponseStructure> submitDeleteBatchResult;

    /**
     * Gets the value of the submitDeleteBatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubmitDeleteBatchResponseStructure }{@code >}
     *     
     */
    public JAXBElement<SubmitDeleteBatchResponseStructure> getSubmitDeleteBatchResult() {
        return submitDeleteBatchResult;
    }

    /**
     * Sets the value of the submitDeleteBatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubmitDeleteBatchResponseStructure }{@code >}
     *     
     */
    public void setSubmitDeleteBatchResult(JAXBElement<SubmitDeleteBatchResponseStructure> value) {
        this.submitDeleteBatchResult = value;
    }

}
