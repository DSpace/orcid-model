package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Declan Newman (declan) Date: 31/07/2012
 */
@XmlType(name = "type")
@XmlEnum
public enum AffiliationType implements Serializable {

    @XmlEnumValue("education")
    EDUCATION("education"),

    @XmlEnumValue("employment")
    EMPLOYMENT("employment");
    
    private final String value;

    AffiliationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }       

    @JsonValue
    public String jsonValue() {
        return this.name();
    }
    
    public static AffiliationType fromValue(String v) {
        for (AffiliationType c : AffiliationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
