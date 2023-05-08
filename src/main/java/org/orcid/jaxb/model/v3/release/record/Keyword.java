package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import io.swagger.v3.oas.annotations.media.Schema;
import org.orcid.jaxb.model.v3.release.common.CreatedDate;
import org.orcid.jaxb.model.v3.release.common.Filterable;
import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;
import org.orcid.jaxb.model.v3.release.common.Source;
import org.orcid.jaxb.model.v3.release.common.Visibility;

/**
 * 
 * @author Angel Montenegro
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "createdDate", "lastModifiedDate", "source", "content" })
@XmlRootElement(name = "keyword", namespace = "http://www.orcid.org/ns/keyword")
@Schema(description = "KeywordV3_0")
public class Keyword implements Filterable, Serializable, Comparable<Keyword>, SourceAware {
    private static final long serialVersionUID = -6506745436549656971L;
    @XmlElement(name = "content", namespace = "http://www.orcid.org/ns/keyword")
    protected String content;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Source source;
    @XmlAttribute(name = "put-code")
    protected Long putCode;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "created-date")
    protected CreatedDate createdDate;
    @XmlAttribute
    @Schema(type = "string", allowableValues = "limited, registered-only, public")
    protected Visibility visibility;
    @XmlAttribute
    protected String path;
    @XmlAttribute(name = "display-index")
    protected Long displayIndex;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Long getPutCode() {
        return putCode;
    }

    public void setPutCode(Long putCode) {
        this.putCode = putCode;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public CreatedDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(CreatedDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }    
    
    public Long getDisplayIndex() {
        return displayIndex;
    }

    public void setDisplayIndex(Long displayIndex) {
        this.displayIndex = displayIndex;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((path == null) ? 0 : path.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((putCode == null) ? 0 : putCode.hashCode());
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
        Keyword other = (Keyword) obj;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
            return false;
        if (content == null) {
            if (other.content != null)
                return false;
        } else if (!content.equals(other.content))
            return false;                
        if (putCode == null) {
            if (other.content != null)
                return false;
        } else if (!putCode.equals(other.putCode))
            return false;        
        if (displayIndex == null) {
            if (other.displayIndex != null)
                return false;
        } else if (!displayIndex.equals(other.displayIndex))
            return false;        
        if (visibility != other.visibility)
            return false;
        return true;
    }

    @Override
    public String retrieveSourcePath() {
        if (source != null) {
            return source.retrieveSourcePath();
        }
        return null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int compareTo(Keyword o) {
        if(o == null || o.getContent() == null) {
            return 1;
        }
                
        if(getContent() == null) {
            return -1;
        }
        
        return this.getContent().compareTo(o.getContent());
    }
}
