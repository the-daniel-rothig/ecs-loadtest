
package uk.gov.dcsf._20090308;

import uk.gov.dcsf._20090810.FetchBatchStatusRequestStructure;

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
 *         &lt;element name="requestInput" type="{http://www.dcsf.gov.uk/20090810/}FetchBatchStatusRequestStructure" minOccurs="0"/&gt;
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
    "requestInput"
})
@XmlRootElement(name = "FetchBatchStatus")
public class FetchBatchStatus {

    @XmlElementRef(name = "requestInput", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<FetchBatchStatusRequestStructure> requestInput;

    /**
     * Gets the value of the requestInput property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FetchBatchStatusRequestStructure }{@code >}
     *     
     */
    public JAXBElement<FetchBatchStatusRequestStructure> getRequestInput() {
        return requestInput;
    }

    /**
     * Sets the value of the requestInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FetchBatchStatusRequestStructure }{@code >}
     *     
     */
    public void setRequestInput(JAXBElement<FetchBatchStatusRequestStructure> value) {
        this.requestInput = value;
    }

}