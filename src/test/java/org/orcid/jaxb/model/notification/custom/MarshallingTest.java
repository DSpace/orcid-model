package org.orcid.jaxb.model.notification.custom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.InputStream;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import org.junit.Test;
/**
 * 
 * @author Will Simpson
 * 
 */

public class MarshallingTest {    
    @Test
    public void testUnMarshallingV2() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("org.orcid.jaxb.model.notification.custom_v2");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream inputStream = MarshallingTest.class.getResourceAsStream("/notification_2.0/samples/notification-custom-2.0.xml");
        org.orcid.jaxb.model.notification.custom_v2.NotificationCustom notification = (org.orcid.jaxb.model.notification.custom_v2.NotificationCustom)unmarshaller.unmarshal(inputStream);
        assertNotNull(notification);
        assertEquals(org.orcid.jaxb.model.notification_v2.NotificationType.CUSTOM, notification.getNotificationType());
        assertEquals("Important Notification from ORCID", notification.getSubject());
        assertEquals("This is an email with important info.\n    ", notification.getBodyText());
        assertEquals("\n        <p>\n            This is an email with <em>important</em> info.\n        </p>\n    ", notification.getBodyHtml());
        assertEquals("2014-01-01T14:45:32", notification.getSentDate().toXMLFormat());
        assertEquals("en-gb", notification.getLang());
    }
}
