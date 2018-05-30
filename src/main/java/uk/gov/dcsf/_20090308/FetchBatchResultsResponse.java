
package uk.gov.dcsf._20090308;

import uk.gov.dcsf._20090810.FetchBatchResultsResponseStructure;

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
 *         &lt;element name="FetchBatchResultsResult" type="{http://www.dcsf.gov.uk/20090810/}FetchBatchResultsResponseStructure" minOccurs="0"/&gt;
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
    "fetchBatchResultsResult"
})
@XmlRootElement(name = "FetchBatchResultsResponse")
public class FetchBatchResultsResponse {

    @XmlElementRef(name = "FetchBatchResultsResult", namespace = "http://www.dcsf.gov.uk/20090308/", type = JAXBElement.class, required = false)
    protected JAXBElement<FetchBatchResultsResponseStructure> fetchBatchResultsResult;

    /**
     * Gets the value of the fetchBatchResultsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FetchBatchResultsResponseStructure }{@code >}
     *     
     */
    public JAXBElement<FetchBatchResultsResponseStructure> getFetchBatchResultsResult() {
        return fetchBatchResultsResult;
    }

    /**
     * Sets the value of the fetchBatchResultsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FetchBatchResultsResponseStructure }{@code >}
     *     
     */
    public void setFetchBatchResultsResult(JAXBElement<FetchBatchResultsResponseStructure> value) {
        this.fetchBatchResultsResult = value;
    }

}
