package org.orcid.jaxb.model.message;

import java.io.Serializable;
import java.util.List;

import jakarta.xml.bind.annotation.XmlEnumValue;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.Lists;

public enum WorkType implements Serializable {
    @XmlEnumValue("artistic-performance")
    ARTISTIC_PERFORMANCE("artistic-performance"),
    @XmlEnumValue("book-chapter")
    BOOK_CHAPTER("book-chapter"),
    @XmlEnumValue("book-review")
    BOOK_REVIEW("book-review"),
    @XmlEnumValue("book")
    BOOK("book"),
    @XmlEnumValue("conference-abstract")
    CONFERENCE_ABSTRACT("conference-abstract"),
    @XmlEnumValue("conference-paper")
    CONFERENCE_PAPER("conference-paper"),
    @XmlEnumValue("conference-poster")
    CONFERENCE_POSTER("conference-poster"),
    @XmlEnumValue("data-set")
    DATA_SET("data-set"),
    @XmlEnumValue("dictionary-entry")
    DICTIONARY_ENTRY("dictionary-entry"),
    @XmlEnumValue("disclosure")
    DISCLOSURE("disclosure"),
    @XmlEnumValue("dissertation")
    DISSERTATION("dissertation"),
    @XmlEnumValue("edited-book")
    EDITED_BOOK("edited-book"),
    @XmlEnumValue("encyclopedia-entry")
    ENCYCLOPEDIA_ENTRY("encyclopedia-entry"),
    @XmlEnumValue("invention")
    INVENTION("invention"),
    @XmlEnumValue("journal-article")
    JOURNAL_ARTICLE("journal-article"),
    @XmlEnumValue("journal-issue")
    JOURNAL_ISSUE("journal-issue"),
    @XmlEnumValue("lecture-speech")
    LECTURE_SPEECH("lecture-speech"),
    @XmlEnumValue("license")
    LICENSE("license"),
    @XmlEnumValue("magazine-article")
    MAGAZINE_ARTICLE("magazine-article"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("newsletter-article")
    NEWSLETTER_ARTICLE("newsletter-article"),
    @XmlEnumValue("newspaper-article")
    NEWSPAPER_ARTICLE("newspaper-article"),
    @XmlEnumValue("online-resource")
    ONLINE_RESOURCE("online-resource"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("patent")
    PATENT("patent"),
    @XmlEnumValue("registered-copyright")
    REGISTERED_COPYRIGHT("registered-copyright"),
    @XmlEnumValue("report")
    REPORT("report"),
    @XmlEnumValue("research-technique")
    RESEARCH_TECHNIQUE("research-technique"),
    @XmlEnumValue("research-tool")
    RESEARCH_TOOL("research-tool"),
    @XmlEnumValue("review")
    REVIEW("review"),
    @XmlEnumValue("spin-off-company")
    SPIN_OFF_COMPANY("spin-off-company"),
    @XmlEnumValue("standards-and-policy")
    STANDARDS_AND_POLICY("standards-and-policy"),
    @XmlEnumValue("supervised-student-publication")
    SUPERVISED_STUDENT_PUBLICATION("supervised-student-publication"),
    @XmlEnumValue("technical-standard")
    TECHNICAL_STANDARD("technical-standard"),
    @XmlEnumValue("test")
    TEST("test"),
    @XmlEnumValue("trademark")
    TRADEMARK("trademark"),
    @XmlEnumValue("translation")
    TRANSLATION("translation"),    
    @XmlEnumValue("website")
    WEBSITE("website"),
    @XmlEnumValue("working-paper")
    WORKING_PAPER("working-paper"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
        
    
    private final String value;
    
    WorkType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    @JsonValue
    public String jsonValue() {
        return this.name();
    }
    
    public static WorkType fromValue(String v) {
        for (WorkType c : WorkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
    /** Return true if type is in the Publications section of the CASRAI dictionary
     * See publication section: http://members.orcid.org/api/supported-work-types
     * 
     * @return boolean indicating whether the work type is a publication
     */
    public boolean isPublication(){
        return publications.contains(this);
    }
    
    /** Return true if type is in the Conference section of the CASRAI dictionary
     * See publication section: http://members.orcid.org/api/supported-work-types
     * 
     * @return boolean indicating whether the work type is a conference
     */
    public boolean isConference(){
        return conferences.contains(this);
    }
    
    private static List<WorkType> publications = Lists.newArrayList(BOOK, BOOK_CHAPTER, BOOK_REVIEW, DICTIONARY_ENTRY, 
            DISSERTATION, ENCYCLOPEDIA_ENTRY, EDITED_BOOK, JOURNAL_ARTICLE, JOURNAL_ISSUE, MAGAZINE_ARTICLE, MANUAL,
            ONLINE_RESOURCE, NEWSLETTER_ARTICLE, NEWSPAPER_ARTICLE, REPORT, RESEARCH_TOOL,SUPERVISED_STUDENT_PUBLICATION,
            TEST, TRANSLATION, WEBSITE, WORKING_PAPER);
    
    private static List<WorkType> conferences = Lists.newArrayList(CONFERENCE_PAPER, CONFERENCE_ABSTRACT, CONFERENCE_POSTER);
}
