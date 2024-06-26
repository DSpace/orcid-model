//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 03:27:53 PM GMT 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.orcid.org/ns/orcid}affiliation-type"/&gt;
 *         &lt;element name="department-name" type="{http://www.orcid.org/ns/orcid}non-empty-string" minOccurs="0"/&gt;
 *         &lt;element name="role-title" type="{http://www.orcid.org/ns/orcid}non-empty-string" minOccurs="0"/&gt;
 *         &lt;element name="start-date" type="{http://www.orcid.org/ns/orcid}fuzzy-date" minOccurs="0"/&gt;
 *         &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}organization"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}source" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/&gt;
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}put-code"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "type", "departmentName", "roleTitle", "startDate", "endDate", "organization", "source", "createdDate", "lastModifiedDate" })
@XmlRootElement(name = "affiliation")
public class Affiliation implements Serializable, VisibilityType, Activity {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "type", required = true)
    protected AffiliationType type;
    @XmlElement(name = "department-name")
    protected String departmentName;
    @XmlElement(name = "role-title")
    protected String roleTitle;
    @XmlElement(name = "start-date")
    protected FuzzyDate startDate;
    @XmlElement(name = "end-date")
    protected FuzzyDate endDate;
    @XmlElement(required = true)
    protected Organization organization;
    protected Source source;
    @XmlAttribute(name = "visibility")
    protected Visibility visibility;
    @XmlAttribute(name = "put-code")
    protected String putCode;
    @XmlElement(name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "created-date")
    protected CreatedDate createdDate;
    
    

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link AffiliationType }
     * 
     */
    public AffiliationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link AffiliationType }
     * 
     */
    public void setType(AffiliationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the roleTitle property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRoleTitle() {
        return roleTitle;
    }

    /**
     * Sets the value of the roleTitle property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRoleTitle(String value) {
        this.roleTitle = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setStartDate(FuzzyDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setEndDate(FuzzyDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return possible object is {@link Organization }
     * 
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *            allowed object is {@link Organization }
     * 
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return possible object is {@link Source }
     * 
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *            allowed object is {@link Source }
     * 
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return possible object is {@link Visibility }
     * 
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *            allowed object is {@link Visibility }
     * 
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the putCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPutCode() {
        return putCode;
    }

    /**
     * Sets the value of the putCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPutCode(String value) {
        this.putCode = value;
    }

    @Override
    public String retrieveSourcePath() {
        if (source == null) {
            return null;
        }
        return source.retrieveSourcePath();
    }
    

    @Override
    public CreatedDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(CreatedDate value) {
        createdDate = value;
    }

    @Override
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    @Override
    public void setLastModifiedDate(LastModifiedDate value) {
        lastModifiedDate = value;
    }

    
    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        result = prime * result + ((roleTitle == null) ? 0 : roleTitle.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        return result;
    }

    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Affiliation other = (Affiliation) obj;
        if (departmentName == null) {
            if (other.departmentName != null)
                return false;
        } else if (!departmentName.equals(other.departmentName))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (organization == null) {
            if (other.organization != null)
                return false;
        } else if (!organization.equals(other.organization))
            return false;
        if (roleTitle == null) {
            if (other.roleTitle != null)
                return false;
        } else if (!roleTitle.equals(other.roleTitle))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (type != other.type)
            return false;
        if (visibility != other.visibility)
            return false;

        /*    
        Breaks our deduping
        if (lastModifiedDate != other.lastModifiedDate) return false;
        if (createdDate != other.createdDate) return false;
        */
        
        return true;
    }

}
