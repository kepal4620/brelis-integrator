//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.03 at 09:46:51 PM CEST 
//


package essilor.integrator.adapter.domain.owvalidation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginInfo" type="{http://OpsysWeb.eu/}VWLoginInfo"/>
 *         &lt;element name="orderxml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginInfo",
    "orderxml"
})
@XmlRootElement(name = "ValidateOrderFromOrderXml")
public class ValidateOrderFromOrderXml {

    @XmlElement(required = true)
    protected VWLoginInfo loginInfo;
    protected String orderxml;

    /**
     * Gets the value of the loginInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VWLoginInfo }
     *     
     */
    public VWLoginInfo getLoginInfo() {
        return loginInfo;
    }

    /**
     * Sets the value of the loginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VWLoginInfo }
     *     
     */
    public void setLoginInfo(VWLoginInfo value) {
        this.loginInfo = value;
    }

    /**
     * Gets the value of the orderxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderxml() {
        return orderxml;
    }

    /**
     * Sets the value of the orderxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderxml(String value) {
        this.orderxml = value;
    }

}