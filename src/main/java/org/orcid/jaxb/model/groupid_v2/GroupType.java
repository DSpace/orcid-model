package org.orcid.jaxb.model.groupid_v2;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "group-type")
@XmlEnum
public enum GroupType {

    @XmlEnumValue("publisher")
    PUBLISHER("publisher"),
    @XmlEnumValue("institution")
    INSTITUTION("institution"),
    @XmlEnumValue("journal")
    JOURNAL("journal"),
    @XmlEnumValue("conference")
    CONFERENCE("conference"),
    @XmlEnumValue("newspaper")
    NEWSPAPER("newspaper"),
    @XmlEnumValue("newsletter")
    NEWSLETTER("newsletter"),
    @XmlEnumValue("magazine")
    MAGAZINE("magazine");
    private final String value;

    GroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @JsonValue
    public String jsonValue() {
        return this.name();
    }
    
    public static GroupType fromValue(String v) {
        for (GroupType c: GroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
