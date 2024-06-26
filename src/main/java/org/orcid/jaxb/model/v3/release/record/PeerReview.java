package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import io.swagger.v3.oas.annotations.media.Schema;
import org.orcid.jaxb.model.common.PeerReviewSubjectType;
import org.orcid.jaxb.model.common.PeerReviewType;
import org.orcid.jaxb.model.common.Role;
import org.orcid.jaxb.model.common.adapters.PeerReviewRoleAdapter;
import org.orcid.jaxb.model.common.adapters.PeerReviewSubjectTypeAdapter;
import org.orcid.jaxb.model.common.adapters.PeerReviewTypeAdapter;
import org.orcid.jaxb.model.v3.release.common.CreatedDate;
import org.orcid.jaxb.model.v3.release.common.Filterable;
import org.orcid.jaxb.model.v3.release.common.FuzzyDate;
import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;
import org.orcid.jaxb.model.v3.release.common.Organization;
import org.orcid.jaxb.model.v3.release.common.OrganizationHolder;
import org.orcid.jaxb.model.v3.release.common.Source;
import org.orcid.jaxb.model.v3.release.common.Title;
import org.orcid.jaxb.model.v3.release.common.Url;
import org.orcid.jaxb.model.v3.release.common.Visibility;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "createdDate", "lastModifiedDate", "source", "role", "externalIdentifiers", "url", "type",  "completionDate",
        "groupId", "subjectExternalIdentifier", "subjectContainerName", "subjectType", "subjectName", "subjectUrl", "organization" })
@XmlRootElement(name = "peer-review", namespace = "http://www.orcid.org/ns/peer-review")
@Schema(description = "PeerReviewV3_0")
public class PeerReview implements Filterable, Serializable, OrganizationHolder, SourceAware, ExternalIdentifiersAwareActivity {
    private static final long serialVersionUID = -1112309604310926743L;
    @XmlJavaTypeAdapter(PeerReviewRoleAdapter.class)
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "reviewer-role")
    @Schema(type = "string", allowableValues = "reviewer, editor, member, chair, organizer")
    protected Role role;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "review-identifiers")
    protected ExternalIDs externalIdentifiers;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "review-url")
    protected Url url;
    @XmlJavaTypeAdapter(PeerReviewTypeAdapter.class)
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "review-type")
    @Schema(type = "string", allowableValues = "review, evaluation")
    protected PeerReviewType type;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "review-completion-date")
    protected FuzzyDate completionDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "review-group-id", required = true)
    protected String groupId;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "subject-external-identifier")
    protected ExternalID subjectExternalIdentifier;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "subject-container-name")
    protected Title subjectContainerName;
    @XmlJavaTypeAdapter(PeerReviewSubjectTypeAdapter.class)
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "subject-type")
    @Schema(type = "string", allowableValues = "artistic-performance, book-chapter, book-review, book, conference-abstract, conference-paper," +
            "conference-poster, data-set, dictionary-entry, disclosure, dissertation-thesis, edited-book, encyclopedia-entry, invention, journal-article," +
            "journal-issue, lecture-speech, license, magazine-article, manual, newsletter-article, newspaper-article, online-resource, other, patent," +
            "registered-copyright, report, research-technique, research-tool, software, spin-off-company, standards-and-policy, supervised-student-publication," +
            "technical-standard, test, trademark, translation, website, working-paper, grant, contract, award, salary-award, research-resource-proposal, undefined")
    protected PeerReviewSubjectType subjectType;
    @XmlElement( namespace = "http://www.orcid.org/ns/peer-review", name = "subject-name")
    protected SubjectName subjectName;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "subject-url")
    protected Url subjectUrl;
    @XmlElement(namespace = "http://www.orcid.org/ns/peer-review", name = "convening-organization")
    protected Organization organization;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Source source;
    @XmlAttribute(name = "put-code")
    protected Long putCode;
    @XmlAttribute
    @Schema(type = "string", allowableValues = "limited, registered-only, public")
    protected Visibility visibility;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "created-date")
    protected CreatedDate createdDate;
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public ExternalIDs getExternalIdentifiers() {
        return externalIdentifiers;
    }

    public void setExternalIdentifiers(ExternalIDs externalIdentifiers) {
        this.externalIdentifiers = externalIdentifiers;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public PeerReviewType getType() {
        return type;
    }

    public void setType(PeerReviewType type) {
        this.type = type;
    }

    public FuzzyDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(FuzzyDate completionDate) {
        this.completionDate = completionDate;
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ExternalID getSubjectExternalIdentifier() {
        return subjectExternalIdentifier;
    }

    public void setSubjectExternalIdentifier(ExternalID subjectExternalIdentifier) {
        this.subjectExternalIdentifier = subjectExternalIdentifier;
    }

    public Title getSubjectContainerName() {
        return subjectContainerName;
    }

    public void setSubjectContainerName(Title subjectContainerName) {
        this.subjectContainerName = subjectContainerName;
    }

    public PeerReviewSubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(PeerReviewSubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public SubjectName getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(SubjectName subjectName) {
        this.subjectName = subjectName;
    }

    public Url getSubjectUrl() {
        return subjectUrl;
    }

    public void setSubjectUrl(Url subjectUrl) {
        this.subjectUrl = subjectUrl;
    }

    @Override
    public String retrieveSourcePath() {
        if (source == null) {
            return null;
        }
        return source.retrieveSourcePath();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((completionDate == null) ? 0 : completionDate.hashCode());
        result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
        result = prime * result + ((externalIdentifiers == null) ? 0 : externalIdentifiers.hashCode());
        result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((subjectExternalIdentifier == null) ? 0 : subjectExternalIdentifier.hashCode());
        result = prime * result + ((subjectContainerName == null) ? 0 : subjectContainerName.hashCode());
        result = prime * result + ((subjectType == null) ? 0 : subjectType.hashCode());
        result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
        result = prime * result + ((subjectUrl == null) ? 0 : subjectUrl.hashCode());
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
        PeerReview other = (PeerReview) obj;

        if (completionDate == null) {
            if (other.completionDate != null)
                return false;
        } else if (!completionDate.equals(other.completionDate))
            return false;
        if (createdDate == null) {
            if (other.createdDate != null)
                return false;
        } else if (!createdDate.equals(other.createdDate))
            return false;
        if (externalIdentifiers == null) {
            if (other.externalIdentifiers != null)
                return false;
        } else if (!externalIdentifiers.equals(other.externalIdentifiers))
            return false;
        if (lastModifiedDate == null) {
            if (other.lastModifiedDate != null)
                return false;
        } else if (!lastModifiedDate.equals(other.lastModifiedDate))
            return false;
        if (organization == null) {
            if (other.organization != null)
                return false;
        } else if (!organization.equals(other.organization))
            return false;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
            return false;
        if (role != other.role)
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;       
        if (type != other.type)
            return false;
        if (url == null) {
            if (other.url != null)
                return false;
        } else if (!url.equals(other.url))
            return false;
        if(subjectExternalIdentifier == null) {
            if(other.subjectExternalIdentifier != null)
                return false;
        } else if(!subjectExternalIdentifier.equals(other.subjectExternalIdentifier)) {
            return false;
        }        
        if(subjectContainerName == null) {
            if(other.subjectContainerName != null)
                return false;
        } else if(!subjectContainerName.equals(other.subjectContainerName)) {
            return false;
        }
        if(subjectType == null) {
            if(other.subjectType != null)
                return false;
        } else if(!subjectType.equals(other.subjectType)) {
            return false;
        }        
        if(subjectName == null) {
            if(other.subjectName != null)
                return false;
        } else if(!subjectName.equals(other.subjectName)) {
            return false;
        }       
        if(subjectUrl == null) {
            if(other.subjectUrl != null)
                return false;
        } else if(!subjectUrl.equals(other.subjectUrl)) {
            return false;
        }        
        if (visibility != other.visibility)
            return false;

        return true;
    }

    /**
     * Indicates if two peer reviews are ORCID duplicated. Two peer review will
     * be duplicated if they have the same source and share at least one
     * external id
     * 
     * @param obj - object to be checked for duplication
     * 
     * @return true if the two peer reviews are duplicated according to ORCID
     *         requirements
     * */
    public boolean isDuplicated(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PeerReview other = (PeerReview) obj;

        // Check if they have the same source
        if (!source.equals(other.getSource())) {
            return false;
        }

        // Check if they share at least one external identifier
        if (externalIdentifiers == null || externalIdentifiers.getExternalIdentifier() == null || externalIdentifiers.getExternalIdentifier().isEmpty()) {
            if (other.getExternalIdentifiers() != null && other.getExternalIdentifiers().getExternalIdentifier() != null
                    && !other.getExternalIdentifiers().getExternalIdentifier().isEmpty()) {
                return false;
            }
        } else {
            if (other.getExternalIdentifiers() == null || other.getExternalIdentifiers().getExternalIdentifier() == null
                    || other.getExternalIdentifiers().getExternalIdentifier().isEmpty()) {
                return false;
            }

            if (externalIdentifiers.getExternalIdentifier().size() != other.getExternalIdentifiers().getExternalIdentifier().size()) {
                return false;
            }

            // If the unique external identifier is empty, the comparison must
            // return false, since two empty ext ids are not equals
            if (externalIdentifiers.getExternalIdentifier().size() == 1) {
                if ((externalIdentifiers.getExternalIdentifier().get(0).getValue() == null && externalIdentifiers.getExternalIdentifier().get(0)
                        .getType() == null)) {
                    return false;
                }
            }

            for (ExternalID thisExtId : externalIdentifiers.getExternalIdentifier()) {
                if (!other.getExternalIdentifiers().getExternalIdentifier().contains(thisExtId)) {
                    return false;
                }
            }
        }

        return true;
    }
}
