package org.orcid.jaxb.model.v3.release.record.summary;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlRootElement(name = "membership-summary", namespace = "http://www.orcid.org/ns/membership")
@Schema(description = "MembershipSummaryV3_0")
public class MembershipSummary extends AffiliationSummary implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2967263626161925359L;
}
