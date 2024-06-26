package org.orcid.jaxb.model.statistics;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Represents a statistics sumamry
 * 
 * 
 * 
 * @author tom
 *
 */
@XmlRootElement(name = "statistics-summary")
public class StatisticsSummary implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ'Z'", timezone = "DEFAULT_TIMEZONE")
    protected Date date;
    protected Map<String, Long> statistics;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Long> getStatistics() {
        return statistics;
    }

    public void setStatistics(Map<String, Long> statistics) {
        this.statistics = statistics;
    }
}
