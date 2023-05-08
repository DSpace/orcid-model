package org.orcid.jaxb.model.v3.release.record.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;
import org.orcid.jaxb.model.v3.release.record.Group;
import org.orcid.jaxb.model.v3.release.record.GroupsContainer;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "researchResourceGroup" })
@XmlRootElement(name = "research-resources", namespace = "http://www.orcid.org/ns/activities")
@Schema(description = "ResearchResourcesV3_0")
public class ResearchResources implements GroupsContainer, Serializable {
    private static final long serialVersionUID = 7836684039680621797L;
    @XmlElement(name = "last-modified-date", namespace = "http://www.orcid.org/ns/common")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "group", namespace = "http://www.orcid.org/ns/activities")
    private List<ResearchResourceGroup> researchResourceGroup;
    @XmlAttribute
    protected String path;

    public List<ResearchResourceGroup> getResearchResourceGroup() {
        if (researchResourceGroup == null) {
            researchResourceGroup = new ArrayList<ResearchResourceGroup>();
        }
        return researchResourceGroup;
    }

    @Override
    public Collection<? extends Group> retrieveGroups() {
        return getResearchResourceGroup();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((researchResourceGroup == null) ? 0 : researchResourceGroup.hashCode());
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
        ResearchResources other = (ResearchResources) obj;
        if (researchResourceGroup == null) {
            if (other.researchResourceGroup != null)
                return false;
        } else if (!researchResourceGroup.equals(other.researchResourceGroup))
            return false;
        return true;
    }

    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
