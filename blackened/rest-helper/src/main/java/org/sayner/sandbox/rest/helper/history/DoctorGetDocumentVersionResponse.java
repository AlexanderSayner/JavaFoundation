package org.sayner.sandbox.rest.helper.history;

import java.util.List;

public class DoctorGetDocumentVersionResponse {
    private List<DocumentVersion> documentVersion;

    public DoctorGetDocumentVersionResponse() {
    }

    public DoctorGetDocumentVersionResponse(List<DocumentVersion> documentVersion) {
        this.documentVersion = documentVersion;
    }

    public void setDocumentVersion(List<DocumentVersion> documentVersion){
        this.documentVersion = documentVersion;
    }
    public List<DocumentVersion> getDocumentVersion(){
        return this.documentVersion;
    }
}
