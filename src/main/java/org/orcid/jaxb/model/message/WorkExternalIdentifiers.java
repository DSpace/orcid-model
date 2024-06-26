//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.13 at 11:03:27 AM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-external-identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}scope"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "workExternalIdentifier" })
@XmlRootElement(name = "work-external-identifiers")
public class WorkExternalIdentifiers implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "work-external-identifier")
    protected List<WorkExternalIdentifier> workExternalIdentifier;
    
    @XmlAttribute
    protected Scope scope;

    public WorkExternalIdentifiers() {

    }

    public WorkExternalIdentifiers(List<WorkExternalIdentifier> workExternalIdentifier) {
        this.workExternalIdentifier = workExternalIdentifier;
    }

    /**
     * Gets the value of the workExternalIdentifier property.
     * 
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the workExternalIdentifier property.
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWorkExternalIdentifier().add(newItem);
     * </pre>
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link WorkExternalIdentifier }
     * 
     * @return a List of WorkExternalIdentifier objects
     * 
     * 
     */
    public List<WorkExternalIdentifier> getWorkExternalIdentifier() {
        if (workExternalIdentifier == null) {
            workExternalIdentifier = new ArrayList<WorkExternalIdentifier>();
        }
        return this.workExternalIdentifier;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return possible object is {@link Scope }
     * 
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *            allowed object is {@link Scope }
     * 
     */
    public void setScope(Scope value) {
        this.scope = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkExternalIdentifiers)) {
            return false;
        }

        WorkExternalIdentifiers that = (WorkExternalIdentifiers) o;

        if (scope != that.scope) {
            return false;
        }
        if (workExternalIdentifier == null) {
            if (that.workExternalIdentifier != null)
                return false;
        } else {
            if (that.workExternalIdentifier == null)
                return false;
            else if (!(workExternalIdentifier.containsAll(that.workExternalIdentifier) && that.workExternalIdentifier.containsAll(workExternalIdentifier) && 
                    that.workExternalIdentifier.size() == workExternalIdentifier.size())) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = workExternalIdentifier != null ? workExternalIdentifier.hashCode() : 0;
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        return result;
    }
}
