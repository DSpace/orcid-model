package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Angel Montenegro
 * 
 */
@XmlRootElement(name = "credit-name", namespace = "http://www.orcid.org/ns/personal-details")
public class CreditName extends org.orcid.jaxb.model.common_v2.CreditName implements Serializable {
    private static final long serialVersionUID = -4407704518314072926L;

}
