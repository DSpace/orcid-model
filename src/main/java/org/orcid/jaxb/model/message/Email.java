//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.01 at 04:40:47 PM GMT 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.orcid.org/ns/orcid&gt;email"&gt;
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/&gt;
 *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="verified" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "value" })
@XmlRootElement(name = "email")
public class Email implements Serializable, VisibilityType {

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute
    protected Boolean primary;
    @XmlAttribute
    protected Boolean current;
    @XmlAttribute
    protected Boolean verified;
    @XmlAttribute
    protected Visibility visibility;
    @XmlAttribute
    protected String source;
    @XmlAttribute(name = "source-client-id")
    protected String sourceClientId;

    public Email() {
        super();
    }

    public Email(String value) {
        super();
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isPrimary() {
        if (primary == null) {
            return false;
        } else {
            return primary;
        }
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isCurrent() {
        if (current == null) {
            return true;
        } else {
            return current;
        }
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

    /**
     * Gets the value of the verified property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isVerified() {
        if (verified == null) {
            return false;
        } else {
            return verified;
        }
    }

    /**
     * Sets the value of the verified property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setVerified(Boolean value) {
        this.verified = value;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceClientId() {
        return sourceClientId;
    }

    public void setSourceClientId(String sourceClientId) {
        this.sourceClientId = sourceClientId;
    }

    /**
     * Note that hashCode and equals only use the value of the address
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    /**
     * Note that hashCode and equals only use the value of the address
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Email other = (Email) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}
