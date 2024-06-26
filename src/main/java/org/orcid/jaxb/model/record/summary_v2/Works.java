package org.orcid.jaxb.model.record.summary_v2;

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

import org.orcid.jaxb.model.common_v2.LastModifiedDate;
import org.orcid.jaxb.model.record_v2.Group;
import org.orcid.jaxb.model.record_v2.GroupsContainer;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "workGroup" })
@XmlRootElement(name = "works", namespace = "http://www.orcid.org/ns/activities")
@Schema(description = "WorksSummaryV2_0")
public class Works implements GroupsContainer, Serializable {

    private static final long serialVersionUID = 3293976926416154039L;
    @XmlElement(name = "last-modified-date", namespace = "http://www.orcid.org/ns/common")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "group", namespace = "http://www.orcid.org/ns/activities")
    private List<WorkGroup> workGroup;
    @XmlAttribute
    protected String path;
    
    public List<WorkGroup> getWorkGroup() {
        if (workGroup == null) {
            workGroup = new ArrayList<WorkGroup>();
        }
        return workGroup;
    }

    @Override
    public Collection<? extends Group> retrieveGroups() {
        return getWorkGroup();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((workGroup == null) ? 0 : workGroup.hashCode());
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
        Works other = (Works) obj;
        if (workGroup == null) {
            if (other.workGroup != null)
                return false;
        } else if (!workGroup.equals(other.workGroup))
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
