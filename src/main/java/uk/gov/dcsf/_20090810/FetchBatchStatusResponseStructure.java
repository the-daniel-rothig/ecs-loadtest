
package uk.gov.dcsf._20090810;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FetchBatchStatusResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FetchBatchStatusResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BatchStatuses" type="{http://www.dcsf.gov.uk/20090810/}ArrayOfBatchStatusItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchBatchStatusResponseStructure", propOrder = {
    "statusCode",
    "batchStatuses"
})
public class FetchBatchStatusResponseStructure {

    @XmlElement(name = "StatusCode")
    protected int statusCode;
    @XmlElement(name = "BatchStatuses", required = true, nillable = true)
    protected ArrayOfBatchStatusItem batchStatuses;

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the batchStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchStatusItem }
     *     
     */
    public ArrayOfBatchStatusItem getBatchStatuses() {
        return batchStatuses;
    }

    /**
     * Sets the value of the batchStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchStatusItem }
     *     
     */
    public void setBatchStatuses(ArrayOfBatchStatusItem value) {
        this.batchStatuses = value;
    }

}
