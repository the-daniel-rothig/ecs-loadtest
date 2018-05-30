
package uk.gov.dcsf._20090308;

import uk.gov.dcsf._20090810.FetchBatchStatusResponseStructure;

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
 *         &lt;element name="FetchBatchStatusResult" type="{http://www.dcsf.gov.uk/20090810/}FetchBatchStatusResponseStructure" minOccurs="0"/&gt;
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
    "fetchBatchStatusResult"
})
@XmlRootElement(name = "FetchBatchStatusResponse")
public class FetchBatchStatusResponse {

    @XmlElementRef(name = "FetchBatchStatusResult", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<FetchBatchStatusResponseStructure> fetchBatchStatusResult;

    /**
     * Gets the value of the fetchBatchStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FetchBatchStatusResponseStructure }{@code >}
     *     
     */
    public JAXBElement<FetchBatchStatusResponseStructure> getFetchBatchStatusResult() {
        return fetchBatchStatusResult;
    }

    /**
     * Sets the value of the fetchBatchStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FetchBatchStatusResponseStructure }{@code >}
     *     
     */
    public void setFetchBatchStatusResult(JAXBElement<FetchBatchStatusResponseStructure> value) {
        this.fetchBatchStatusResult = value;
    }

}
