//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.19 at 07:48:00 PM CEST 
//


package essilor.integrator.adapter.domain.b2boptic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Zernikes11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Zernikes11">
 *   &lt;complexContent>
 *     &lt;extension base="{}Zernikes10">
 *       &lt;sequence>
 *         &lt;element name="z_11_M11" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_M9" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_M7" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_M5" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_M3" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_M1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_3" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_5" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_7" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_9" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="z_11_11" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zernikes11", propOrder = {
    "z11M11",
    "z11M9",
    "z11M7",
    "z11M5",
    "z11M3",
    "z11M1",
    "z111",
    "z113",
    "z115",
    "z117",
    "z119",
    "z1111"
})
@XmlSeeAlso({
    Zernikes12 .class
})
public class Zernikes11
    extends Zernikes10
{

    @XmlElement(name = "z_11_M11")
    protected float z11M11;
    @XmlElement(name = "z_11_M9")
    protected float z11M9;
    @XmlElement(name = "z_11_M7")
    protected float z11M7;
    @XmlElement(name = "z_11_M5")
    protected float z11M5;
    @XmlElement(name = "z_11_M3")
    protected float z11M3;
    @XmlElement(name = "z_11_M1")
    protected float z11M1;
    @XmlElement(name = "z_11_1")
    protected float z111;
    @XmlElement(name = "z_11_3")
    protected float z113;
    @XmlElement(name = "z_11_5")
    protected float z115;
    @XmlElement(name = "z_11_7")
    protected float z117;
    @XmlElement(name = "z_11_9")
    protected float z119;
    @XmlElement(name = "z_11_11")
    protected float z1111;

    /**
     * Gets the value of the z11M11 property.
     * 
     */
    public float getZ11M11() {
        return z11M11;
    }

    /**
     * Sets the value of the z11M11 property.
     * 
     */
    public void setZ11M11(float value) {
        this.z11M11 = value;
    }

    /**
     * Gets the value of the z11M9 property.
     * 
     */
    public float getZ11M9() {
        return z11M9;
    }

    /**
     * Sets the value of the z11M9 property.
     * 
     */
    public void setZ11M9(float value) {
        this.z11M9 = value;
    }

    /**
     * Gets the value of the z11M7 property.
     * 
     */
    public float getZ11M7() {
        return z11M7;
    }

    /**
     * Sets the value of the z11M7 property.
     * 
     */
    public void setZ11M7(float value) {
        this.z11M7 = value;
    }

    /**
     * Gets the value of the z11M5 property.
     * 
     */
    public float getZ11M5() {
        return z11M5;
    }

    /**
     * Sets the value of the z11M5 property.
     * 
     */
    public void setZ11M5(float value) {
        this.z11M5 = value;
    }

    /**
     * Gets the value of the z11M3 property.
     * 
     */
    public float getZ11M3() {
        return z11M3;
    }

    /**
     * Sets the value of the z11M3 property.
     * 
     */
    public void setZ11M3(float value) {
        this.z11M3 = value;
    }

    /**
     * Gets the value of the z11M1 property.
     * 
     */
    public float getZ11M1() {
        return z11M1;
    }

    /**
     * Sets the value of the z11M1 property.
     * 
     */
    public void setZ11M1(float value) {
        this.z11M1 = value;
    }

    /**
     * Gets the value of the z111 property.
     * 
     */
    public float getZ111() {
        return z111;
    }

    /**
     * Sets the value of the z111 property.
     * 
     */
    public void setZ111(float value) {
        this.z111 = value;
    }

    /**
     * Gets the value of the z113 property.
     * 
     */
    public float getZ113() {
        return z113;
    }

    /**
     * Sets the value of the z113 property.
     * 
     */
    public void setZ113(float value) {
        this.z113 = value;
    }

    /**
     * Gets the value of the z115 property.
     * 
     */
    public float getZ115() {
        return z115;
    }

    /**
     * Sets the value of the z115 property.
     * 
     */
    public void setZ115(float value) {
        this.z115 = value;
    }

    /**
     * Gets the value of the z117 property.
     * 
     */
    public float getZ117() {
        return z117;
    }

    /**
     * Sets the value of the z117 property.
     * 
     */
    public void setZ117(float value) {
        this.z117 = value;
    }

    /**
     * Gets the value of the z119 property.
     * 
     */
    public float getZ119() {
        return z119;
    }

    /**
     * Sets the value of the z119 property.
     * 
     */
    public void setZ119(float value) {
        this.z119 = value;
    }

    /**
     * Gets the value of the z1111 property.
     * 
     */
    public float getZ1111() {
        return z1111;
    }

    /**
     * Sets the value of the z1111 property.
     * 
     */
    public void setZ1111(float value) {
        this.z1111 = value;
    }

}