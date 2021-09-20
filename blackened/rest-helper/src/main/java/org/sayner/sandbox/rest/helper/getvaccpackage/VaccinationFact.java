package org.sayner.sandbox.rest.helper.getvaccpackage;

import java.util.List;

public class VaccinationFact {
    private String vaccinationDocumentId;

    private String immunodiagnosisResult;

    private String vaccinationFactId;

    private String rejectionReasonId;

    private String documentId;

    private String vaccinationFactStatus;

    private String vaccineName;

    private String uploadDocumentId;

    private List<VaccinationInfections> vaccinationInfections;

    private String vaccinationFactStatusDate;

    private String createDate;

    private String vaccinationType;

    private String vaccinationDate;

    public VaccinationFact() {
    }

    public VaccinationFact(String vaccinationDocumentId, String immunodiagnosisResult, String vaccinationFactId, String rejectionReasonId, String documentId, String vaccinationFactStatus, String vaccineName, String uploadDocumentId, List<VaccinationInfections> vaccinationInfections, String vaccinationFactStatusDate, String createDate, String vaccinationType, String vaccinationDate) {
        this.vaccinationDocumentId = vaccinationDocumentId;
        this.immunodiagnosisResult = immunodiagnosisResult;
        this.vaccinationFactId = vaccinationFactId;
        this.rejectionReasonId = rejectionReasonId;
        this.documentId = documentId;
        this.vaccinationFactStatus = vaccinationFactStatus;
        this.vaccineName = vaccineName;
        this.uploadDocumentId = uploadDocumentId;
        this.vaccinationInfections = vaccinationInfections;
        this.vaccinationFactStatusDate = vaccinationFactStatusDate;
        this.createDate = createDate;
        this.vaccinationType = vaccinationType;
        this.vaccinationDate = vaccinationDate;
    }

    public String getVaccinationDocumentId() {
        return vaccinationDocumentId;
    }

    public void setVaccinationDocumentId(String vaccinationDocumentId) {
        this.vaccinationDocumentId = vaccinationDocumentId;
    }

    public String getImmunodiagnosisResult() {
        return immunodiagnosisResult;
    }

    public void setImmunodiagnosisResult(String immunodiagnosisResult) {
        this.immunodiagnosisResult = immunodiagnosisResult;
    }

    public String getVaccinationFactId() {
        return vaccinationFactId;
    }

    public void setVaccinationFactId(String vaccinationFactId) {
        this.vaccinationFactId = vaccinationFactId;
    }

    public String getRejectionReasonId() {
        return rejectionReasonId;
    }

    public void setRejectionReasonId(String rejectionReasonId) {
        this.rejectionReasonId = rejectionReasonId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getVaccinationFactStatus() {
        return vaccinationFactStatus;
    }

    public void setVaccinationFactStatus(String vaccinationFactStatus) {
        this.vaccinationFactStatus = vaccinationFactStatus;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getUploadDocumentId() {
        return uploadDocumentId;
    }

    public void setUploadDocumentId(String uploadDocumentId) {
        this.uploadDocumentId = uploadDocumentId;
    }

    public List<VaccinationInfections> getVaccinationInfections() {
        return vaccinationInfections;
    }

    public void setVaccinationInfections(List<VaccinationInfections> vaccinationInfections) {
        this.vaccinationInfections = vaccinationInfections;
    }

    public String getVaccinationFactStatusDate() {
        return vaccinationFactStatusDate;
    }

    public void setVaccinationFactStatusDate(String vaccinationFactStatusDate) {
        this.vaccinationFactStatusDate = vaccinationFactStatusDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getVaccinationType() {
        return vaccinationType;
    }

    public void setVaccinationType(String vaccinationType) {
        this.vaccinationType = vaccinationType;
    }

    public String getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(String vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }
}
