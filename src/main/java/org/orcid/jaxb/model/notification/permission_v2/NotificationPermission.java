//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 04:27:39 PM GMT 
//

package org.orcid.jaxb.model.notification.permission_v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.orcid.jaxb.model.notification_v2.Notification;
import org.orcid.jaxb.model.notification_v2.NotificationType;

import io.swagger.v3.oas.annotations.media.Schema;

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
 *         &lt;element ref="{http://www.orcid.org/ns/notification}authorization-url"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/notification}activities"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}created-date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}sent-date" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = { "putCode", "notificationType", "authorizationUrl", "notificationSubject", "notificationIntro", "items", "createdDate", "sentDate", "readDate", "actionedDate", "archivedDate", "source" })
@XmlRootElement(name = "notification", namespace = "http://www.orcid.org/ns/notification")
@Schema(description = "NotificationPermissionV2_0")
public class NotificationPermission extends Notification {
    private static final long serialVersionUID = 9109472272556575757L;
    @XmlElement(name = "authorization-url", namespace = "http://www.orcid.org/ns/notification", required = true)
    protected AuthorizationUrl authorizationUrl;
    @XmlElement(namespace = "http://www.orcid.org/ns/notification", required = true)
    protected Items items;
    @XmlElement(name = "actioned-date", namespace = "http://www.orcid.org/ns/notification")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionedDate;
    @XmlTransient
    protected String subject;
    @XmlElement(name = "notification-subject", namespace = "http://www.orcid.org/ns/notification")
    protected String notificationSubject;
    @XmlElement(name = "notification-intro", namespace = "http://www.orcid.org/ns/notification")
    protected String notificationIntro;

    {
        notificationType = NotificationType.PERMISSION;
    }

    /**
     * Gets the value of the authorizationUrl property.
     * 
     * @return possible object is {@link AuthorizationUrl }
     * 
     */
    public AuthorizationUrl getAuthorizationUrl() {
        return authorizationUrl;
    }

    /**
     * Sets the value of the authorizationUrl property.
     * 
     * @param value
     *            allowed object is {@link AuthorizationUrl }
     * 
     */
    public void setAuthorizationUrl(AuthorizationUrl value) {
        this.authorizationUrl = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return possible object is {@link Items }
     * 
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *            allowed object is {@link Items }
     * 
     */
    public void setItems(Items value) {
        this.items = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getNotificationSubject() {
        return notificationSubject;
    }

    public void setNotificationSubject(String notificationSubject) {
        this.notificationSubject = notificationSubject;
    }

    public XMLGregorianCalendar getActionedDate() {
        return actionedDate;
    }

    public void setActionedDate(XMLGregorianCalendar actionedDate) {
        this.actionedDate = actionedDate;
    }

    public String getNotificationIntro() {
        return notificationIntro;
    }

    public void setNotificationIntro(String intro) {
        this.notificationIntro = intro;
    }           
}
