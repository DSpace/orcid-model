package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_v2.LastModifiedDate;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 
 * @author Angel Montenegro
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "emails" })
@XmlRootElement(name = "emails", namespace = "http://www.orcid.org/ns/email")
@Schema(description = "EmailsV2_0")
public class Emails implements Serializable {

    private static final long serialVersionUID = -4412096758081316953L;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "email", namespace = "http://www.orcid.org/ns/email")
    List<Email> emails;
    @XmlAttribute
    protected String path;

    public List<Email> getEmails() {
        if(emails == null) {
            emails = new ArrayList<>();
         }
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
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
        result = prime * result + ((emails == null) ? 0 : emails.hashCode());
        result = prime * result + ((path == null) ? 0 : path.hashCode());
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
        Emails other = (Emails) obj;
        if (emails == null) {
            if (other.emails != null)
                return false;
        } else if (!emails.equals(other.emails))
            return false;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
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
