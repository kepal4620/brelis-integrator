//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.19 at 07:48:00 PM CEST 
//


package essilor.integrator.adapter.domain.b2boptic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commercialCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minIntensity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxIntensity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="coatingType" use="required" type="{}CoatingTypes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coating", propOrder = {
    "commercialCode",
    "minIntensity",
    "maxIntensity",
    "colorName"
})
public class Coating {

    @XmlElement(required = true)
    protected String commercialCode;
    protected BigInteger minIntensity;
    protected BigInteger maxIntensity;
    protected String colorName;
    @XmlAttribute(name = "coatingType", required = true)
    protected CoatingTypes coatingType;

    /**
     * Gets the value of the commercialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialCode() {
        return commercialCode;
    }

    /**
     * Sets the value of the commercialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialCode(String value) {
        this.commercialCode = value;
    }

    /**
     * Gets the value of the minIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinIntensity() {
        return minIntensity;
    }

    /**
     * Sets the value of the minIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinIntensity(BigInteger value) {
        this.minIntensity = value;
    }

    /**
     * Gets the value of the maxIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxIntensity() {
        return maxIntensity;
    }

    /**
     * Sets the value of the maxIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxIntensity(BigInteger value) {
        this.maxIntensity = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
    }

    /**
     * Gets the value of the coatingType property.
     * 
     * @return
     *     possible object is
     *     {@link CoatingTypes }
     *     
     */
    public CoatingTypes getCoatingType() {
        return coatingType;
    }

    /**
     * Sets the value of the coatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoatingTypes }
     *     
     */
    public void setCoatingType(CoatingTypes value) {
        this.coatingType = value;
    }

}
