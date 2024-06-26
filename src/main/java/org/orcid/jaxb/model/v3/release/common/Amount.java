package org.orcid.jaxb.model.v3.release.common;

import java.io.Serializable;
import java.util.Currency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang.StringUtils;
import org.orcid.jaxb.model.common.adapters.CurrencyAdapter;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "content" })
@XmlRootElement(name = "amount", namespace = "http://www.orcid.org/ns/common")
@Schema(description = "AmountV3_0")
public class Amount implements Serializable {
    private static final long serialVersionUID = -3479057385911792849L;
    @XmlValue
    protected String content;
    @XmlJavaTypeAdapter(CurrencyAdapter.class)
    @XmlAttribute(required = true, name = "currency-code")
    protected Currency currencyCode;
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCurrencyCode() {
        return (currencyCode == null) ? null : currencyCode.getCurrencyCode();
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = (currencyCode == null) ? null : Currency.getInstance(currencyCode);        
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + (StringUtils.isEmpty(this.content) ? 0 : this.content.hashCode());
        result = prime * result + (this.currencyCode == null ? 0 : this.currencyCode.hashCode());
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
        Amount other = (Amount) obj;
        if (this.content == null) {
            if (other.content != null)
                return false;
        } else if (!this.content.equals(other.content))
            return false;

        if (this.currencyCode == null) {
            if (other.currencyCode != null)
                return false;
        } else if (!this.currencyCode.equals(other.currencyCode))
            return false;

        return true;
    }
}
