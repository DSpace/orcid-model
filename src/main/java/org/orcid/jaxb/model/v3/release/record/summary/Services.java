package org.orcid.jaxb.model.v3.release.record.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlRootElement(name = "services", namespace = "http://www.orcid.org/ns/activities")
@Schema(description = "ServicesV3_0")
public class Services extends Affiliations<ServiceSummary> implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 5138824260612086887L;

    public Services() {

    }

    public Services(Collection<AffiliationGroup<ServiceSummary>> groups) {
        super();
        this.groups = groups;
    }

    public Collection<AffiliationGroup<ServiceSummary>> getServiceGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList<AffiliationGroup<ServiceSummary>>();
        }
        return (Collection<AffiliationGroup<ServiceSummary>>) this.groups;
    }

    @Override
    public Collection<AffiliationGroup<ServiceSummary>> retrieveGroups() {
        return getServiceGroups();
    }
}
