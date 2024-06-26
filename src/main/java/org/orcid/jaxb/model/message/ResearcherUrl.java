//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.03 at 11:47:41 AM BST 
//

package org.orcid.jaxb.model.message;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}url-name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}url" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "urlName", "url" })
@XmlRootElement(name = "researcher-url")
public class ResearcherUrl implements Comparable<ResearcherUrl>, VisibilityType, PrivateVisibleToSource, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8978502528841038967L;
    @XmlElement(name = "url-name")
    protected UrlName urlName;
    protected Url url;

    @XmlTransient
    @JsonIgnore
    protected Visibility visibility;
    
    @XmlTransient
    @JsonIgnore
    protected Source source;
    
    public ResearcherUrl() {
        super();
    }

    public ResearcherUrl(Url url, Visibility vis) {
        super();
        this.url = url;
        this.visibility = vis;
    }

    public ResearcherUrl(Url url, UrlName urlName,Visibility vis) {
        super();
        this.url = url;
        this.visibility = vis;
        this.urlName = urlName;
    }

    /**
     * Gets the value of the urlName property.
     * 
     * @return
     *     possible object is
     *     {@link UrlName }
     *     
     */
    public UrlName getUrlName() {
        return urlName;
    }

    /**
     * Sets the value of the urlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlName }
     *     
     */
    public void setUrlName(UrlName value) {
        this.urlName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    public Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    public void setUrl(Url value) {
        this.url = value;
    }
    
    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public int compareTo(ResearcherUrl researcherUrl) {
        if (researcherUrl == null || StringUtils.isBlank(researcherUrl.getUrl().getValue())) {
            return -1;
        } else if (url == null || StringUtils.isBlank(url.getValue())) {
            return 1;
        } else {
            return url.compareTo(researcherUrl.getUrl());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResearcherUrl)) {
            return false;
        }

        ResearcherUrl that = (ResearcherUrl) o;

        if (url != null ? !url.equals(that.url) : that.url != null) {
            return false;
        }
        if (urlName != null ? !urlName.equals(that.urlName) : that.urlName != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlName != null ? urlName.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
