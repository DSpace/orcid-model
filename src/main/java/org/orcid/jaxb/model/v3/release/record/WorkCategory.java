package org.orcid.jaxb.model.v3.release.record;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.xml.bind.annotation.XmlEnumValue;

import org.orcid.jaxb.model.common.WorkType;

public enum WorkCategory {
    @XmlEnumValue("publication")
    PUBLICATION("publication", WorkType.BOOK_CHAPTER, WorkType.BOOK_REVIEW, WorkType.BOOK, WorkType.DICTIONARY_ENTRY, WorkType.DISSERTATION_THESIS, WorkType.EDITED_BOOK,
            WorkType.ENCYCLOPEDIA_ENTRY, WorkType.JOURNAL_ARTICLE, WorkType.JOURNAL_ISSUE, WorkType.MAGAZINE_ARTICLE, WorkType.MANUAL, WorkType.NEWSLETTER_ARTICLE,
            WorkType.NEWSPAPER_ARTICLE, WorkType.ONLINE_RESOURCE, WorkType.PREPRINT, WorkType.REPORT, WorkType.RESEARCH_TOOL, WorkType.SUPERVISED_STUDENT_PUBLICATION, WorkType.TEST,
            WorkType.TRANSLATION, WorkType.WEBSITE, WorkType.WORKING_PAPER, WorkType.REVIEW), @XmlEnumValue("conference")
    CONFERENCE("conference", WorkType.CONFERENCE_ABSTRACT, WorkType.CONFERENCE_PAPER, WorkType.CONFERENCE_POSTER), @XmlEnumValue("intellectual_property")
    INTELLECTUAL_PROPERTY("intellectual_property", WorkType.DISCLOSURE, WorkType.LICENSE, WorkType.PATENT, WorkType.REGISTERED_COPYRIGHT, WorkType.TRADEMARK), @XmlEnumValue("other_output")
    OTHER_OUTPUT("other_output", WorkType.ANNOTATION, WorkType.ARTISTIC_PERFORMANCE, WorkType.DATA_MANAGEMENT_PLAN, WorkType.DATA_SET, WorkType.INVENTION, WorkType.LECTURE_SPEECH, WorkType.OTHER,
            WorkType.PHYSICAL_OBJECT, WorkType.RESEARCH_TECHNIQUE, WorkType.SOFTWARE, WorkType.SPIN_OFF_COMPANY, WorkType.STANDARDS_AND_POLICY, WorkType.TECHNICAL_STANDARD, WorkType.UNDEFINED);

    private List<WorkType> types = new ArrayList<WorkType>();
    private String value;

    private WorkCategory(String value, WorkType... types) {
        this.value = value;
        for (WorkType subType : types) {
            this.types.add(subType);
        }
    }

    public String value() {
        return value;
    }

    public List<WorkType> getSubTypes() {
        return Collections.unmodifiableList(types);
    }

    public static WorkCategory fromValue(String v) {
        for (WorkCategory c : WorkCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static WorkCategory fromWorkType(WorkType type) {
        if (PUBLICATION.getSubTypes().contains(type))
            return PUBLICATION;
        else if (CONFERENCE.getSubTypes().contains(type))
            return CONFERENCE;
        else if (INTELLECTUAL_PROPERTY.getSubTypes().contains(type))
            return INTELLECTUAL_PROPERTY;
        else if (OTHER_OUTPUT.getSubTypes().contains(type))
            return OTHER_OUTPUT;
        else 
            throw new IllegalArgumentException("Invalid work type provided: " + type.name());
    }
}
