package org.orcid.jaxb.model.v3.release.record.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlRootElement(name = "qualifications", namespace = "http://www.orcid.org/ns/activities")
@Schema(description = "QualificationsV3_0")
public class Qualifications extends Affiliations<QualificationSummary> implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4227026264367214274L;

    public Qualifications() {

    }
    
    public Qualifications(Collection<AffiliationGroup<QualificationSummary>> groups) {
        super();
        this.groups = groups;
    }

    public Collection<AffiliationGroup<QualificationSummary>> getQualificationGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList<AffiliationGroup<QualificationSummary>>();
        }
        return (Collection<AffiliationGroup<QualificationSummary>>) this.groups;
    }

    @Override
    public Collection<AffiliationGroup<QualificationSummary>> retrieveGroups() {
        return getQualificationGroups();
    }
}
