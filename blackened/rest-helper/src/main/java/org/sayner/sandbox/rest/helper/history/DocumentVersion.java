package org.sayner.sandbox.rest.helper.history;

import java.util.List;

public class DocumentVersion {
    private String authorName;

    private String eventStartDate;

    private String authorRole;

    private List<Sections> sections;

    private String documentId;

    private int versionNumber;

    private String authorSpeciality;

    public DocumentVersion() {
    }

    public DocumentVersion(String authorName, String eventStartDate, String authorRole, List<Sections> sections, String documentId, int versionNumber, String authorSpeciality) {
        this.authorName = authorName;
        this.eventStartDate = eventStartDate;
        this.authorRole = authorRole;
        this.sections = sections;
        this.documentId = documentId;
        this.versionNumber = versionNumber;
        this.authorSpeciality = authorSpeciality;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(String eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public String getAuthorRole() {
        return authorRole;
    }

    public void setAuthorRole(String authorRole) {
        this.authorRole = authorRole;
    }

    public List<Sections> getSections() {
        return sections;
    }

    public void setSections(List<Sections> sections) {
        this.sections = sections;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getAuthorSpeciality() {
        return authorSpeciality;
    }

    public void setAuthorSpeciality(String authorSpeciality) {
        this.authorSpeciality = authorSpeciality;
    }
}
