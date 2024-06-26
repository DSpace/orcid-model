//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}orcid-search-result" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "orcidSearchResult" })
@XmlRootElement(name = "orcid-search-results")
public class OrcidSearchResults implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlAttribute(name = "num-found")
    protected long numFound;
    @XmlElement(name = "orcid-search-result")
    protected List<OrcidSearchResult> orcidSearchResult;

    public long getNumFound() {
        return numFound;
    }

    public void setNumFound(long numFound) {
        this.numFound = numFound;
    }

    /**
     * Gets the value of the orcidSearchResult property.
     * 
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the orcidSearchResult property.
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOrcidSearchResult().add(newItem);
     * </pre>
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link OrcidSearchResult }
     * 
     * @return a List of OrcidSearchResult objects
     * 
     */
    public List<OrcidSearchResult> getOrcidSearchResult() {
        if (orcidSearchResult == null) {
            orcidSearchResult = new ArrayList<OrcidSearchResult>();
        }
        return this.orcidSearchResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrcidSearchResults)) {
            return false;
        }

        OrcidSearchResults that = (OrcidSearchResults) o;

        if (orcidSearchResult != null ? !orcidSearchResult.equals(that.orcidSearchResult) : that.orcidSearchResult != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return orcidSearchResult != null ? orcidSearchResult.hashCode() : 0;
    }
}
