//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * Java class for orcid-type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;simpleType name="orcid-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="grant"/&gt;
 *     &lt;enumeration value="contract"/&gt;
 *     &lt;enumeration value="award"/&gt;
 *     &lt;enumeration value="salary-award"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "grant-type")
@XmlEnum
public enum FundingType implements Serializable {
    @XmlEnumValue("grant")
    GRANT("grant"), 
    @XmlEnumValue("contract")
    CONTRACT("contract"), 
    @XmlEnumValue("award")
    AWARD("award"),
    @XmlEnumValue("salary-award")
    SALARY_AWARD("salary-award");
    private final String value;

    FundingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @JsonValue
    public String jsonValue() {
        return this.name();
    }
    
    public static FundingType fromValue(String v) {
        for (FundingType c : FundingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
