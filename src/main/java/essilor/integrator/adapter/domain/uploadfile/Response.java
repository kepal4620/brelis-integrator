//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.03 at 09:48:44 PM CEST 
//


package essilor.integrator.adapter.domain.uploadfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMSOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://services.visionweb.com}ResponseStatus"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderError" type="{http://services.visionweb.com}ArrayOfOrderError" minOccurs="0"/>
 *         &lt;element name="CalculationResults" type="{http://services.visionweb.com}CalculationResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "orderId",
    "pmsOrderId",
    "status",
    "timeStamp",
    "orderError",
    "calculationResults"
})
public class Response {

    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "PMSOrderId")
    protected String pmsOrderId;
    @XmlElement(name = "Status", required = true)
    protected ResponseStatus status;
    @XmlElement(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "OrderError")
    protected ArrayOfOrderError orderError;
    @XmlElement(name = "CalculationResults")
    protected CalculationResults calculationResults;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the pmsOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSOrderId() {
        return pmsOrderId;
    }

    /**
     * Sets the value of the pmsOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSOrderId(String value) {
        this.pmsOrderId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setStatus(ResponseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the orderError property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderError }
     *     
     */
    public ArrayOfOrderError getOrderError() {
        return orderError;
    }

    /**
     * Sets the value of the orderError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderError }
     *     
     */
    public void setOrderError(ArrayOfOrderError value) {
        this.orderError = value;
    }

    /**
     * Gets the value of the calculationResults property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationResults }
     *     
     */
    public CalculationResults getCalculationResults() {
        return calculationResults;
    }

    /**
     * Sets the value of the calculationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationResults }
     *     
     */
    public void setCalculationResults(CalculationResults value) {
        this.calculationResults = value;
    }

}
