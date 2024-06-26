package org.orcid.jaxb.model.v3.release.notification.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "notifications" })
@XmlRootElement(name = "notifications", namespace = "http://www.orcid.org/ns/notification")
@Schema(description = "NotificationPermissionsV3_0")
public class NotificationPermissions implements Serializable {

	private static final long serialVersionUID = 720972206804832580L;

	@XmlElement(name = "notification", namespace = "http://www.orcid.org/ns/notification")
	private List<NotificationPermission> notifications;

	public List<NotificationPermission> getNotifications() {
		if (notifications == null)
			notifications = new ArrayList<>();
		return notifications;
	}

	public void setNotifications(List<NotificationPermission> notifications) {
		this.notifications = notifications;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((notifications == null) ? 0 : notifications.hashCode());
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
		NotificationPermissions other = (NotificationPermissions) obj;
		if (notifications == null) {
			if (other.notifications != null)
				return false;
		} else if (!notifications.equals(other.notifications))
			return false;
		return true;
	}

}
