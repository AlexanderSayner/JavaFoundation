package org.sayner.sandbox.rest.helper.trash;

import java.util.List;

public class VaccinationFact {
    private String vaccinationFactId;

    private String vaccinationDate;

    private String rejectionReasonId;

    private List<String> vaccinationInfections;

    private String vaccineName;

    private String vaccinationFactStatus;

    private String vaccinationFactStatusDate;

    private String immunodiagnosisResult;

    private String documentId;

    private String uploadDocumentId;

    private String vaccinationType;

    private String vaccinationDocumentId;

    public VaccinationFact(String vaccinationFactId, String vaccinationDate, String rejectionReasonId, List<String> vaccinationInfections, String vaccineName, String vaccinationFactStatus, String vaccinationFactStatusDate, String immunodiagnosisResult, String documentId, String uploadDocumentId, String vaccinationType, String vaccinationDocumentId) {
        this.vaccinationFactId = vaccinationFactId;
        this.vaccinationDate = vaccinationDate;
        this.rejectionReasonId = rejectionReasonId;
        this.vaccinationInfections = vaccinationInfections;
        this.vaccineName = vaccineName;
        this.vaccinationFactStatus = vaccinationFactStatus;
        this.vaccinationFactStatusDate = vaccinationFactStatusDate;
        this.immunodiagnosisResult = immunodiagnosisResult;
        this.documentId = documentId;
        this.uploadDocumentId = uploadDocumentId;
        this.vaccinationType = vaccinationType;
        this.vaccinationDocumentId = vaccinationDocumentId;
    }

    public void setVaccinationFactId(String vaccinationFactId){
        this.vaccinationFactId = vaccinationFactId;
    }
    public String getVaccinationFactId(){
        return this.vaccinationFactId;
    }
    public void setVaccinationDate(String vaccinationDate){
        this.vaccinationDate = vaccinationDate;
    }
    public String getVaccinationDate(){
        return this.vaccinationDate;
    }
    public void setRejectionReasonId(String rejectionReasonId){
        this.rejectionReasonId = rejectionReasonId;
    }
    public String getRejectionReasonId(){
        return this.rejectionReasonId;
    }
    public void setVaccinationInfections(List<String> vaccinationInfections){
        this.vaccinationInfections = vaccinationInfections;
    }
    public List<String> getVaccinationInfections(){
        return this.vaccinationInfections;
    }
    public void setVaccineName(String vaccineName){
        this.vaccineName = vaccineName;
    }
    public String getVaccineName(){
        return this.vaccineName;
    }
    public void setVaccinationFactStatus(String vaccinationFactStatus){
        this.vaccinationFactStatus = vaccinationFactStatus;
    }
    public String getVaccinationFactStatus(){
        return this.vaccinationFactStatus;
    }
    public void setVaccinationFactStatusDate(String vaccinationFactStatusDate){
        this.vaccinationFactStatusDate = vaccinationFactStatusDate;
    }
    public String getVaccinationFactStatusDate(){
        return this.vaccinationFactStatusDate;
    }
    public void setImmunodiagnosisResult(String immunodiagnosisResult){
        this.immunodiagnosisResult = immunodiagnosisResult;
    }
    public String getImmunodiagnosisResult(){
        return this.immunodiagnosisResult;
    }
    public void setDocumentId(String documentId){
        this.documentId = documentId;
    }
    public String getDocumentId(){
        return this.documentId;
    }
    public void setUploadDocumentId(String uploadDocumentId){
        this.uploadDocumentId = uploadDocumentId;
    }
    public String getUploadDocumentId(){
        return this.uploadDocumentId;
    }
    public void setVaccinationType(String vaccinationType){
        this.vaccinationType = vaccinationType;
    }
    public String getVaccinationType(){
        return this.vaccinationType;
    }
    public void setVaccinationDocumentId(String vaccinationDocumentId){
        this.vaccinationDocumentId = vaccinationDocumentId;
    }
    public String getVaccinationDocumentId(){
        return this.vaccinationDocumentId;
    }
}
