//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.03 at 09:48:44 PM CEST 
//


package essilor.integrator.adapter.domain.uploadfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filestring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subordid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "username",
    "pswd",
    "filestring",
    "subordid",
    "refid"
})
@XmlRootElement(name = "UploadFileUser")
public class UploadFileUser {

    protected String username;
    protected String pswd;
    protected String filestring;
    protected String subordid;
    protected String refid;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the filestring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilestring() {
        return filestring;
    }

    /**
     * Sets the value of the filestring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilestring(String value) {
        this.filestring = value;
    }

    /**
     * Gets the value of the subordid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubordid() {
        return subordid;
    }

    /**
     * Sets the value of the subordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubordid(String value) {
        this.subordid = value;
    }

    /**
     * Gets the value of the refid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefid() {
        return refid;
    }

    /**
     * Sets the value of the refid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefid(String value) {
        this.refid = value;
    }

}