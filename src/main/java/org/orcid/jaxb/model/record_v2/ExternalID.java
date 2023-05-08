package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_v2.Url;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;

/** New external identifier class
 * 
 * @author tom
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "type","value", "url", "relationship" })
@Schema(description = "ExternalIDV2_0")
public class ExternalID implements GroupAble,Cloneable,Serializable{
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "external-id-type", namespace = "http://www.orcid.org/ns/common", required = true)
    protected String type;
    @XmlElement(name = "external-id-value", namespace = "http://www.orcid.org/ns/common", required = true)
    protected String value;
    @XmlElement(name="external-id-url", namespace = "http://www.orcid.org/ns/common")
    protected Url url;
    @XmlElement(name="external-id-relationship", namespace = "http://www.orcid.org/ns/common")
    protected Relationship relationship;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    @Override
    @JsonIgnore
    public String getGroupId() {
        String workIdVal = this.value == null ? null : this.value;
        String typeVal = this.type == null ? null : this.type;
        return workIdVal + typeVal; 
    }
    
    @Override
    @JsonIgnore
    public boolean isGroupAble() {
        //Dont group if it is a part-of identifier
        if(Relationship.PART_OF.equals(relationship))
            return false;
        
        // Dont groups works where the external id is empty
        if (this.getValue() == null || this.getValue().isEmpty())
            return false;

        return true;
    }
    
    public static ExternalID fromMessageExtId(org.orcid.jaxb.model.message.WorkExternalIdentifier oldExtId) {
        ExternalID id = new ExternalID();
        id.setType(oldExtId.getWorkExternalIdentifierType().value());
        id.setValue(oldExtId.getWorkExternalIdentifierId().getContent());
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExternalID other = (ExternalID) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    public ExternalID clone() {
        ExternalID id = new ExternalID();
        id.type=this.getType();
        id.value=this.getValue();
        if (this.getUrl()!=null)
            id.url=new Url(this.getUrl().getValue());
        if (this.getRelationship()!=null)
            id.relationship=this.getRelationship();
        return id;
    }

}
