
package uk.gov.dcsf._20090810;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfValidationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationResult" type="{http://www.dcsf.gov.uk/20090810/}ValidationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfValidationResult", propOrder = {
    "validationResult"
})
public class ArrayOfValidationResult {

    @XmlElement(name = "ValidationResult", nillable = true)
    protected List<ValidationResult> validationResult;

    /**
     * Gets the value of the validationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResult }
     * 
     * 
     */
    public List<ValidationResult> getValidationResult() {
        if (validationResult == null) {
            validationResult = new ArrayList<ValidationResult>();
        }
        return this.validationResult;
    }

}
