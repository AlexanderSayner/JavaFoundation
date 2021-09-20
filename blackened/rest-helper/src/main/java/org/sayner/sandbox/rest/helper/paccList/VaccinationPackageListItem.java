package org.sayner.sandbox.rest.helper.paccList;

public class VaccinationPackageListItem {
    private String lockDate;

    private String vaccinationPackageStatusDate;

    private boolean isLocked;

    private String vaccinationPackageId;

    private PatientInfo patientInfo;

    private String createDate;

    private String vaccinationPackageStatus;

    public VaccinationPackageListItem() {
    }

    public VaccinationPackageListItem(String lockDate, String vaccinationPackageStatusDate, boolean isLocked, String vaccinationPackageId, PatientInfo patientInfo, String createDate, String vaccinationPackageStatus) {
        this.lockDate = lockDate;
        this.vaccinationPackageStatusDate = vaccinationPackageStatusDate;
        this.isLocked = isLocked;
        this.vaccinationPackageId = vaccinationPackageId;
        this.patientInfo = patientInfo;
        this.createDate = createDate;
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }

    public void setLockDate(String lockDate){
        this.lockDate = lockDate;
    }
    public String getLockDate(){
        return this.lockDate;
    }
    public void setVaccinationPackageStatusDate(String vaccinationPackageStatusDate){
        this.vaccinationPackageStatusDate = vaccinationPackageStatusDate;
    }
    public String getVaccinationPackageStatusDate(){
        return this.vaccinationPackageStatusDate;
    }
    public void setIsLocked(boolean isLocked){
        this.isLocked = isLocked;
    }
    public boolean getIsLocked(){
        return this.isLocked;
    }
    public void setVaccinationPackageId(String vaccinationPackageId){
        this.vaccinationPackageId = vaccinationPackageId;
    }
    public String getVaccinationPackageId(){
        return this.vaccinationPackageId;
    }
    public void setPatientInfo(PatientInfo patientInfo){
        this.patientInfo = patientInfo;
    }
    public PatientInfo getPatientInfo(){
        return this.patientInfo;
    }
    public void setCreateDate(String createDate){
        this.createDate = createDate;
    }
    public String getCreateDate(){
        return this.createDate;
    }
    public void setVaccinationPackageStatus(String vaccinationPackageStatus){
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }
    public String getVaccinationPackageStatus(){
        return this.vaccinationPackageStatus;
    }
}
