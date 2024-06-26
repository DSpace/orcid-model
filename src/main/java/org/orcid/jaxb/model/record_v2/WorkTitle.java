//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.record_v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_v2.Subtitle;
import org.orcid.jaxb.model.common_v2.Title;
import org.orcid.jaxb.model.common_v2.TranslatedTitle;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "title", "subtitle", "translatedTitle" })
@XmlRootElement(name = "title", namespace = "http://www.orcid.org/ns/work")
@Schema(description = "WorkTitleV2_0")
public class WorkTitle implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Title title;
    
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Subtitle subtitle;
    
    @XmlElement(name="translated-title", namespace = "http://www.orcid.org/ns/common")
    protected TranslatedTitle translatedTitle;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link Subtitle }
     *     
     */
    public Subtitle getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subtitle }
     *     
     */
    public void setSubtitle(Subtitle value) {
        this.subtitle = value;
    }

    
    /**
     * Gets the value of the translatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link translatedTitle }
     *     
     */
    public TranslatedTitle getTranslatedTitle() {
        return translatedTitle;
    }

    /**
     * Sets the value of the translatedTitle property.
     * 
     * @param translatedTitle - the translated title
     *     
     */
    public void setTranslatedTitle(TranslatedTitle translatedTitle) {
        this.translatedTitle = translatedTitle;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((subtitle == null) ? 0 : subtitle.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((translatedTitle == null) ? 0 : translatedTitle.hashCode());
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
        WorkTitle other = (WorkTitle) obj;
        if (subtitle == null) {
            if (other.subtitle != null)
                return false;
        } else if (!subtitle.equals(other.subtitle))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        
        if(translatedTitle == null){
            if(other.translatedTitle != null)
                return false;
        } else if(!translatedTitle.equals(other.translatedTitle))
            return false;
        
        return true;
    }

}
