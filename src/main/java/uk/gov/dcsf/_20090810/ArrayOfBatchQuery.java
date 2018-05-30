
package uk.gov.dcsf._20090810;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfBatchQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBatchQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BatchQuery" type="{http://www.dcsf.gov.uk/20090810/}BatchQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBatchQuery", propOrder = {
    "batchQuery"
})
public class ArrayOfBatchQuery {

    @XmlElement(name = "BatchQuery", nillable = true)
    protected List<BatchQuery> batchQuery;

    /**
     * Gets the value of the batchQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchQuery }
     * 
     * 
     */
    public List<BatchQuery> getBatchQuery() {
        if (batchQuery == null) {
            batchQuery = new ArrayList<BatchQuery>();
        }
        return this.batchQuery;
    }

}
