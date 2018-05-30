
package uk.gov.dcsf._20090810;

import uk.gov.dcsf._20090308.QueryData;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserToQuery" type="{http://www.dcsf.gov.uk/20090308/}QueryData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchQuery", propOrder = {
    "rowID",
    "userToQuery"
})
public class BatchQuery {

    @XmlElementRef(name = "RowID", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rowID;
    @XmlElementRef(name = "UserToQuery", namespace = "http://www.dcsf.gov.uk/20090810/", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryData> userToQuery;

    /**
     * Gets the value of the rowID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRowID() {
        return rowID;
    }

    /**
     * Sets the value of the rowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRowID(JAXBElement<String> value) {
        this.rowID = value;
    }

    /**
     * Gets the value of the userToQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryData }{@code >}
     *     
     */
    public JAXBElement<QueryData> getUserToQuery() {
        return userToQuery;
    }

    /**
     * Sets the value of the userToQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryData }{@code >}
     *     
     */
    public void setUserToQuery(JAXBElement<QueryData> value) {
        this.userToQuery = value;
    }

}
