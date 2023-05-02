package org.orcid.jaxb.model.notification.amended_v2;

import jakarta.xml.bind.annotation.XmlEnum;

/**
 * 
 * @author Will Simpson
 *
 */
@XmlEnum
public enum AmendedSection {
    AFFILIATION, BIO, EDUCATION, EMPLOYMENT, EXTERNAL_IDENTIFIERS, FUNDING, PEER_REVIEW, PREFERENCES, WORK, UNKNOWN, RESEARCH_RESOURCE;
}
