package org.sayner.sandbox.rest.helper.getvaccpackage;

public class VaccinationPackage {
    private PatientInfo patientInfo;

    private String vaccinationPackageId;

    private String scanDocumentId;

    private int rejectionReasonId;

    private String submissionSetId;

    private String lockDate;

    private String scanUploadDocumentId;

    private VaccinationFacts vaccinationFacts;

    private String createDate;

    private String vaccinationPackageStatusDate;

    private boolean isLocked;

    private String vaccinationPackageStatus;

    public VaccinationPackage() {
    }

    public VaccinationPackage(PatientInfo patientInfo, String vaccinationPackageId, String scanDocumentId, int rejectionReasonId, String submissionSetId, String lockDate, String scanUploadDocumentId, VaccinationFacts vaccinationFacts, String createDate, String vaccinationPackageStatusDate, boolean isLocked, String vaccinationPackageStatus) {
        this.patientInfo = patientInfo;
        this.vaccinationPackageId = vaccinationPackageId;
        this.scanDocumentId = scanDocumentId;
        this.rejectionReasonId = rejectionReasonId;
        this.submissionSetId = submissionSetId;
        this.lockDate = lockDate;
        this.scanUploadDocumentId = scanUploadDocumentId;
        this.vaccinationFacts = vaccinationFacts;
        this.createDate = createDate;
        this.vaccinationPackageStatusDate = vaccinationPackageStatusDate;
        this.isLocked = isLocked;
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }

    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }

    public String getVaccinationPackageId() {
        return vaccinationPackageId;
    }

    public void setVaccinationPackageId(String vaccinationPackageId) {
        this.vaccinationPackageId = vaccinationPackageId;
    }

    public String getScanDocumentId() {
        return scanDocumentId;
    }

    public void setScanDocumentId(String scanDocumentId) {
        this.scanDocumentId = scanDocumentId;
    }

    public int getRejectionReasonId() {
        return rejectionReasonId;
    }

    public void setRejectionReasonId(int rejectionReasonId) {
        this.rejectionReasonId = rejectionReasonId;
    }

    public String getSubmissionSetId() {
        return submissionSetId;
    }

    public void setSubmissionSetId(String submissionSetId) {
        this.submissionSetId = submissionSetId;
    }

    public String getLockDate() {
        return lockDate;
    }

    public void setLockDate(String lockDate) {
        this.lockDate = lockDate;
    }

    public String getScanUploadDocumentId() {
        return scanUploadDocumentId;
    }

    public void setScanUploadDocumentId(String scanUploadDocumentId) {
        this.scanUploadDocumentId = scanUploadDocumentId;
    }

    public VaccinationFacts getVaccinationFacts() {
        return vaccinationFacts;
    }

    public void setVaccinationFacts(VaccinationFacts vaccinationFacts) {
        this.vaccinationFacts = vaccinationFacts;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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

    public String getVaccinationPackageStatus() {
        return vaccinationPackageStatus;
    }

    public void setVaccinationPackageStatus(String vaccinationPackageStatus) {
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }
}
