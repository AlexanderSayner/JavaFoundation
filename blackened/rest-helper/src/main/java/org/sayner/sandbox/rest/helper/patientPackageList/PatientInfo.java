package org.sayner.sandbox.rest.helper.patientPackageList;

import java.util.List;

public class PatientInfo {
    private int emiasId;

    private List<Attachment> attachment;

    public PatientInfo() {
    }

    public PatientInfo(int emiasId, List<Attachment> attachment) {
        this.emiasId = emiasId;
        this.attachment = attachment;
    }

    public int getEmiasId() {
        return emiasId;
    }

    public void setEmiasId(int emiasId) {
        this.emiasId = emiasId;
    }

    public List<Attachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }
}
