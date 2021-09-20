package org.sayner.sandbox.rest.helper.trash;

public class VaccinationPackage {
    private String scanUploadDocumentId;

    private String lockDate;

    private String vaccinationPackageStatusDate;

    private boolean isLocked;

    private int rejectionReasonId;

    private String vaccinationPackageId;

    private VaccinationFacts vaccinationFacts;

    private PatientInfo patientInfo;

    private String scanDocumentId;

    private String submissionSetId;

    private String createDate;

    private String vaccinationPackageStatus;

    public VaccinationPackage(String scanUploadDocumentId, String lockDate, String vaccinationPackageStatusDate, boolean isLocked, int rejectionReasonId, String vaccinationPackageId, VaccinationFacts vaccinationFacts, PatientInfo patientInfo, String scanDocumentId, String submissionSetId, String createDate, String vaccinationPackageStatus) {
        this.scanUploadDocumentId = scanUploadDocumentId;
        this.lockDate = lockDate;
        this.vaccinationPackageStatusDate = vaccinationPackageStatusDate;
        this.isLocked = isLocked;
        this.rejectionReasonId = rejectionReasonId;
        this.vaccinationPackageId = vaccinationPackageId;
        this.vaccinationFacts = vaccinationFacts;
        this.patientInfo = patientInfo;
        this.scanDocumentId = scanDocumentId;
        this.submissionSetId = submissionSetId;
        this.createDate = createDate;
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }

    public String getScanUploadDocumentId() {
        return scanUploadDocumentId;
    }

    public void setScanUploadDocumentId(String scanUploadDocumentId) {
        this.scanUploadDocumentId = scanUploadDocumentId;
    }

    public String getLockDate() {
        return lockDate;
    }

    public void setLockDate(String lockDate) {
        this.lockDate = lockDate;
    }

    public String getVaccinationPackageStatusDate() {
        return vaccinationPackageStatusDate;
    }

    public void setVaccinationPackageStatusDate(String vaccinationPackageStatusDate) {
        this.vaccinationPackageStatusDate = vaccinationPackageStatusDate;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getRejectionReasonId() {
        return rejectionReasonId;
    }

    public void setRejectionReasonId(int rejectionReasonId) {
        this.rejectionReasonId = rejectionReasonId;
    }

    public String getVaccinationPackageId() {
        return vaccinationPackageId;
    }

    public void setVaccinationPackageId(String vaccinationPackageId) {
        this.vaccinationPackageId = vaccinationPackageId;
    }

    public VaccinationFacts getVaccinationFacts() {
        return vaccinationFacts;
    }

    public void setVaccinationFacts(VaccinationFacts vaccinationFacts) {
        this.vaccinationFacts = vaccinationFacts;
    }

    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }

    public String getScanDocumentId() {
        return scanDocumentId;
    }

    public void setScanDocumentId(String scanDocumentId) {
        this.scanDocumentId = scanDocumentId;
    }

    public String getSubmissionSetId() {
        return submissionSetId;
    }

    public void setSubmissionSetId(String submissionSetId) {
        this.submissionSetId = submissionSetId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getVaccinationPackageStatus() {
        return vaccinationPackageStatus;
    }

    public void setVaccinationPackageStatus(String vaccinationPackageStatus) {
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }
}
