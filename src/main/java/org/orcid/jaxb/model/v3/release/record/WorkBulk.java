package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.record.bulk.BulkElement;
import org.orcid.jaxb.model.record.bulk.BulkElementContainer;
import org.orcid.jaxb.model.v3.release.error.OrcidError;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "bulk" })
@XmlRootElement(name = "bulk", namespace=  "http://www.orcid.org/ns/bulk")
@Schema(description = "WorkBulkV3_0")
public class WorkBulk implements Serializable, BulkElementContainer {    
    private static final long serialVersionUID = 1338769097760031210L;
    
    @XmlElements({
        @XmlElement(namespace = "http://www.orcid.org/ns/work", name = "work", type = Work.class),
        @XmlElement(namespace = "http://www.orcid.org/ns/error", name = "error", type = OrcidError.class)
    })
    private List<BulkElement> bulk;

    public List<BulkElement> getBulk() {
        if(bulk == null) {
            bulk = new ArrayList<BulkElement>();
        }
        return bulk;
    }

    public void setBulk(List<BulkElement> bulk) {
        this.bulk = bulk;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bulk == null) ? 0 : bulk.hashCode());
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
        WorkBulk other = (WorkBulk) obj;
        if (bulk == null) {
            if (other.bulk != null)
                return false;
        } else if (!bulk.equals(other.bulk))
            return false;
        return true;
    }        
}
