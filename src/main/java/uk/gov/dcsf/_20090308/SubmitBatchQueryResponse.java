
package uk.gov.dcsf._20090308;

import uk.gov.dcsf._20090810.SubmitBatchQueryResponseStructure;

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
 *         &lt;element name="SubmitBatchQueryResult" type="{http://www.dcsf.gov.uk/20090810/}SubmitBatchQueryResponseStructure" minOccurs="0"/&gt;
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
    "submitBatchQueryResult"
})
@XmlRootElement(name = "SubmitBatchQueryResponse")
public class SubmitBatchQueryResponse {

    @XmlElementRef(name = "SubmitBatchQueryResult", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<SubmitBatchQueryResponseStructure> submitBatchQueryResult;

    /**
     * Gets the value of the submitBatchQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubmitBatchQueryResponseStructure }{@code >}
     *     
     */
    public JAXBElement<SubmitBatchQueryResponseStructure> getSubmitBatchQueryResult() {
        return submitBatchQueryResult;
    }

    /**
     * Sets the value of the submitBatchQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubmitBatchQueryResponseStructure }{@code >}
     *     
     */
    public void setSubmitBatchQueryResult(JAXBElement<SubmitBatchQueryResponseStructure> value) {
        this.submitBatchQueryResult = value;
    }

}
