package org.orcid.jaxb.model.notification.permission_v2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 
 * @author Will Simpson
 *
 */
@XmlEnum
@Schema(description = "ItemTypeV2_0")
public enum ItemType {
    //@formatter:off
    @XmlEnumValue("education") EDUCATION,
    @XmlEnumValue("employment") EMPLOYMENT,
    @XmlEnumValue("funding") FUNDING,
    @XmlEnumValue("peer-review") PEER_REVIEW,
    @XmlEnumValue("work") WORK;
    //@formatter:on
    
    @JsonValue
    public String jsonValue() {
        return this.name();
    }
}
