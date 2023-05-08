package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "orcidIds" })
@XmlRootElement(name = "orcid-ids", namespace = "http://www.orcid.org/ns/orcid-id")
public class OrcidIds implements Serializable {
    private static final long serialVersionUID = 921607209700657276L;
    @XmlElement(name = "orcid-id", namespace = "http://www.orcid.org/ns/orcid-id")
    List<OrcidId> orcidIds;

    public List<OrcidId> getOrcidIds() {
        if (orcidIds == null) {
            orcidIds = new ArrayList<>();
        }
        return orcidIds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orcidIds == null) ? 0 : orcidIds.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        OrcidIds other = (OrcidIds) obj;
        if (orcidIds == null && other.orcidIds != null) {
            return false;
        }

        if (orcidIds.size() != other.orcidIds.size()) {
            return false;
        }

        for (int i = 0; i < orcidIds.size(); i++) {
            if (!orcidIds.get(i).equals(other.orcidIds.get(i))) {
                return false;
            }
        }
        return true;
    }

}
