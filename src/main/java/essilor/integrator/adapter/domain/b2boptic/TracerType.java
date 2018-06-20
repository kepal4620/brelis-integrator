//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.19 at 07:48:00 PM CEST 
//


package essilor.integrator.adapter.domain.b2boptic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TracerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TracerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hoya 3DFT"/>
 *     &lt;enumeration value="Hoya GT1000"/>
 *     &lt;enumeration value="Hoya GT3000"/>
 *     &lt;enumeration value="Hoya GT3000 OMA"/>
 *     &lt;enumeration value="Hoya UT1000"/>
 *     &lt;enumeration value="Essilor Gamma"/>
 *     &lt;enumeration value="Essilor PHI PCCOM"/>
 *     &lt;enumeration value="Essilor PHI OMA"/>
 *     &lt;enumeration value="Essilor Kappa PCCOM"/>
 *     &lt;enumeration value="Essilor Kappa OMA"/>
 *     &lt;enumeration value="National Optronics 4T"/>
 *     &lt;enumeration value="Briot ScanfomNet I"/>
 *     &lt;enumeration value="Briot ScanfomNet II"/>
 *     &lt;enumeration value="Weco 3DFT+"/>
 *     &lt;enumeration value="Weco Trace II"/>
 *     &lt;enumeration value="Weco Trace III"/>
 *     &lt;enumeration value="Nidek LT700"/>
 *     &lt;enumeration value="Nidek LT900"/>
 *     &lt;enumeration value="Nidek LT900 OMA"/>
 *     &lt;enumeration value="Nidek LT1000"/>
 *     &lt;enumeration value="Indo NDK"/>
 *     &lt;enumeration value="Indo OMA"/>
 *     &lt;enumeration value="Topcon FR50"/>
 *     &lt;enumeration value="Takubomatic FD80"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TracerType")
@XmlEnum
public enum TracerType {

    @XmlEnumValue("Hoya 3DFT")
    HOYA_3_DFT("Hoya 3DFT"),
    @XmlEnumValue("Hoya GT1000")
    HOYA_GT_1000("Hoya GT1000"),
    @XmlEnumValue("Hoya GT3000")
    HOYA_GT_3000("Hoya GT3000"),
    @XmlEnumValue("Hoya GT3000 OMA")
    HOYA_GT_3000_OMA("Hoya GT3000 OMA"),
    @XmlEnumValue("Hoya UT1000")
    HOYA_UT_1000("Hoya UT1000"),
    @XmlEnumValue("Essilor Gamma")
    ESSILOR_GAMMA("Essilor Gamma"),
    @XmlEnumValue("Essilor PHI PCCOM")
    ESSILOR_PHI_PCCOM("Essilor PHI PCCOM"),
    @XmlEnumValue("Essilor PHI OMA")
    ESSILOR_PHI_OMA("Essilor PHI OMA"),
    @XmlEnumValue("Essilor Kappa PCCOM")
    ESSILOR_KAPPA_PCCOM("Essilor Kappa PCCOM"),
    @XmlEnumValue("Essilor Kappa OMA")
    ESSILOR_KAPPA_OMA("Essilor Kappa OMA"),
    @XmlEnumValue("National Optronics 4T")
    NATIONAL_OPTRONICS_4_T("National Optronics 4T"),
    @XmlEnumValue("Briot ScanfomNet I")
    BRIOT_SCANFOM_NET_I("Briot ScanfomNet I"),
    @XmlEnumValue("Briot ScanfomNet II")
    BRIOT_SCANFOM_NET_II("Briot ScanfomNet II"),
    @XmlEnumValue("Weco 3DFT+")
    WECO_3_DFT("Weco 3DFT+"),
    @XmlEnumValue("Weco Trace II")
    WECO_TRACE_II("Weco Trace II"),
    @XmlEnumValue("Weco Trace III")
    WECO_TRACE_III("Weco Trace III"),
    @XmlEnumValue("Nidek LT700")
    NIDEK_LT_700("Nidek LT700"),
    @XmlEnumValue("Nidek LT900")
    NIDEK_LT_900("Nidek LT900"),
    @XmlEnumValue("Nidek LT900 OMA")
    NIDEK_LT_900_OMA("Nidek LT900 OMA"),
    @XmlEnumValue("Nidek LT1000")
    NIDEK_LT_1000("Nidek LT1000"),
    @XmlEnumValue("Indo NDK")
    INDO_NDK("Indo NDK"),
    @XmlEnumValue("Indo OMA")
    INDO_OMA("Indo OMA"),
    @XmlEnumValue("Topcon FR50")
    TOPCON_FR_50("Topcon FR50"),
    @XmlEnumValue("Takubomatic FD80")
    TAKUBOMATIC_FD_80("Takubomatic FD80"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TracerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TracerType fromValue(String v) {
        for (TracerType c: TracerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
