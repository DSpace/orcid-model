package org.orcid.jaxb.model.message;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "date", "primaryRecord"})
@XmlRootElement(name = "deprecated")
public class OrcidDeprecated implements Serializable {
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "deprecated-date")
    @XmlSchemaType(name = "dateTime")
    protected DeprecatedDate date;
    @XmlElement(name = "primary-record")
    protected PrimaryRecord primaryRecord;
    
	public DeprecatedDate getDate() {
		return date;
	}
	public void setDate(DeprecatedDate date) {
		this.date = date;
	}
	public PrimaryRecord getPrimaryRecord() {
		return primaryRecord;
	}
	public void setPrimaryRecord(PrimaryRecord primaryRecord) {
		this.primaryRecord = primaryRecord;
	}
    
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrcidDeprecated other = (OrcidDeprecated) obj;
        
        if(date == null){
        	if(other.getDate() != null)
        		return false;
        }
        if(!date.equals(other.getDate()))
        	return false;        
        if(primaryRecord == null){
        	if(other.getPrimaryRecord() != null)
        		return false;
        }        
        if(!primaryRecord.equals(other.getPrimaryRecord()))
        	return false;
        return true;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((primaryRecord == null) ? 0 : primaryRecord.hashCode());        
        return result;
    }
}
