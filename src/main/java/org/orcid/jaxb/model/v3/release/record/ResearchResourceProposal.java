package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.v3.release.common.FuzzyDate;
import org.orcid.jaxb.model.v3.release.common.Url;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "title", "hosts", "externalIdentifiers", "startDate", "endDate", "url" })
@XmlRootElement(name = "proposal", namespace = "http://www.orcid.org/ns/research-resource")
@Schema(description = "ResearchResourceProposalV3_0")
public class ResearchResourceProposal implements Serializable {
    private static final long serialVersionUID = 4396414540438557932L;
    @XmlElement(namespace = "http://www.orcid.org/ns/research-resource", name = "title")
    protected ResearchResourceTitle title;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "start-date")
    protected FuzzyDate startDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "end-date")
    protected FuzzyDate endDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/research-resource", name = "hosts")
    protected ResearchResourceHosts hosts;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "external-ids")
    protected ExternalIDs externalIdentifiers;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "url")
    protected Url url;

    public ResearchResourceTitle getTitle() {
        return title;
    }

    public void setTitle(ResearchResourceTitle title) {
        this.title = title;
    }

    public ResearchResourceHosts getHosts() {
        if (hosts == null)
            hosts = new ResearchResourceHosts();
        return hosts;
    }

    public void setHosts(ResearchResourceHosts hosts) {
        this.hosts = hosts;
    }

    public FuzzyDate getStartDate() {
        return startDate;
    }

    public void setStartDate(FuzzyDate startDate) {
        this.startDate = startDate;
    }

    public FuzzyDate getEndDate() {
        return endDate;
    }

    public void setEndDate(FuzzyDate endDate) {
        this.endDate = endDate;
    }

    public ExternalIDs getExternalIdentifiers() {
        return externalIdentifiers;
    }

    public void setExternalIdentifiers(ExternalIDs externalIdentifiers) {
        this.externalIdentifiers = externalIdentifiers;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

}
