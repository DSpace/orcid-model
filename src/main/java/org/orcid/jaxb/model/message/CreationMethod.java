//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 04:58:24 PM GMT 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Java class for creation-method values..
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;xs:simpleType&gt;
 *   &lt;xs:restriction base="xs:string"&gt;
 *     &lt;xs:enumeration value="API"/&gt;
 *     &lt;xs:enumeration value="manual"&gt;
 *   &lt;/xs:restriction&gt;
 * &lt;/xs:simpleType&gt;
 * </pre>
 * 
 */
@XmlEnum
@ApiModel(value = "CreationMethodV2_0")
public enum CreationMethod implements Serializable {

    /**
     * The profile was created using the Tier 2 API.
     * 
     */
    @XmlEnumValue("API")
    API("API"),

    /**
     * The user registered on the /register page.
     * 
     */
    @XmlEnumValue("Direct")
    DIRECT("Direct"),

    /**
     * The registered on the /oauth/signin.
     * 
     */
    @XmlEnumValue("Member-referred")
    MEMBER_REFERRED("Member-referred"),

    /**
     * The profile was created manually using the ORCID web user interface.
     * 
     */
    @XmlEnumValue("website")
    WEBSITE("website"),

    /**
     * The profile was created manually using the ORCID web user interface.
     * 
     */
    @XmlEnumValue("integration-test")
    INTEGRATION_TEST("integration-test");
    
    private final String value;

    CreationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @JsonValue
    public String jsonValue() {
        return this.name();
    }
    
    public static CreationMethod fromValue(String v) {
        for (CreationMethod c : CreationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static boolean isValid(String v) {
        for (CreationMethod c : CreationMethod.values()) {
            if (c.value.equals(v)) {
                return true;
            }
        }
        return false;
    }

}