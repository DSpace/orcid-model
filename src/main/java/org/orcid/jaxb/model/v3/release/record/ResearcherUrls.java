package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 
 * @author Angel Montenegro
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "researcherUrls" })
@XmlRootElement(name = "researcher-urls", namespace = "http://www.orcid.org/ns/researcher-url")
@Schema(description = "ResearcherUrlsV3_0")
public class ResearcherUrls implements Serializable {    
    private static final long serialVersionUID = 885429862087269009L;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "researcher-url", namespace = "http://www.orcid.org/ns/researcher-url")
    List<ResearcherUrl> researcherUrls;
    @XmlAttribute
    protected String path;

    public List<ResearcherUrl> getResearcherUrls() {
        if(researcherUrls == null) {
            researcherUrls = new ArrayList<>();
        }
        return researcherUrls;
    }

    public void setResearcherUrls(List<ResearcherUrl> researcherUrls) {
        this.researcherUrls = researcherUrls;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((path == null) ? 0 : path.hashCode());
        result = prime * result + ((researcherUrls == null) ? 0 : researcherUrls.hashCode());
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
        ResearcherUrls other = (ResearcherUrls) obj;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
            return false;
        if (researcherUrls == null) {
            if (other.researcherUrls != null)
                return false;
        } else if (!researcherUrls.equals(other.researcherUrls))
            return false;
        return true;
    }
    
	public LastModifiedDate getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
