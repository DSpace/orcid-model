//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 06:46:00 PM BST 
//

package org.orcid.jaxb.model.v3.release.notification;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;

import io.swagger.v3.oas.annotations.media.Schema;
import org.orcid.jaxb.model.v3.release.common.Source;
import org.orcid.jaxb.model.v3.release.record.SourceAware;

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
 *         &lt;element ref="{http://www.orcid.org/ns/common}put-code" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/notification}notification-type"/&gt;
 *         &lt;element name="created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sent-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="read-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="archived-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}source" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlTransient
abstract public class Notification implements Serializable, SourceAware {

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "put-code")
    protected Long putCode;
    @XmlElement(name = "notification-type", namespace = "http://www.orcid.org/ns/notification", required = true)
    @Schema(type = "string", allowableValues = "custom, institutional-connection, permission, amended, service-anouncement, " +
            "administrative, tip, find-my-stuff")
    protected NotificationType notificationType;
    @XmlElement(name = "created-date", namespace = "http://www.orcid.org/ns/common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "sent-date", namespace = "http://www.orcid.org/ns/common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDate;
    @XmlElement(name = "read-date", namespace = "http://www.orcid.org/ns/common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readDate;
    @XmlElement(name = "archived-date", namespace = "http://www.orcid.org/ns/common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar archivedDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Source source;
    @XmlTransient
    protected String sourceDescription;
    @XmlTransient
    protected String encryptedPutCode;

    /**
     * Gets the value of the putCode property.
     * 
     * @return possible object is {@link Long }
     * 
     */
    public Long getPutCode() {
        return putCode;
    }

    /**
     * Sets the value of the putCode property.
     * 
     * @param value - the put code
     * 
     */
    public void setPutCode(Long value) {
        this.putCode = value;
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return possible object is {@link NotificationType }
     * 
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *            allowed object is {@link NotificationType }
     * 
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the sentDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setSentDate(XMLGregorianCalendar value) {
        this.sentDate = value;
    }

    /**
     * Gets the value of the readDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getReadDate() {
        return readDate;
    }

    /**
     * Sets the value of the readDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setReadDate(XMLGregorianCalendar value) {
        this.readDate = value;
    }

    /**
     * Gets the value of the archivedDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getArchivedDate() {
        return archivedDate;
    }

    /**
     * Sets the value of the archivedDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setArchivedDate(XMLGregorianCalendar value) {
        this.archivedDate = value;
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

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public String getEncryptedPutCode() {
        return encryptedPutCode;
    }

    public void setEncryptedPutCode(String encryptedPutCode) {
        this.encryptedPutCode = encryptedPutCode;
    }

}
