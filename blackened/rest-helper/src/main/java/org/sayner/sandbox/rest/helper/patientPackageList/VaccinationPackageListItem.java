package org.sayner.sandbox.rest.helper.patientPackageList;

public class VaccinationPackageListItem {
    private String lockDate;

    private String vaccinationPackageStatusDate;

    private boolean isLocked;

    private String vaccinationPackageId;

    private String createDate;

    private String vaccinationPackageStatus;

    public VaccinationPackageListItem(String lockDate, String vaccinationPackageStatusDate, boolean isLocked, String vaccinationPackageId, String createDate, String vaccinationPackageStatus) {
        this.lockDate = lockDate;
        this.vaccinationPackageStatusDate = vaccinationPackageStatusDate;
        this.isLocked = isLocked;
        this.vaccinationPackageId = vaccinationPackageId;
        this.createDate = createDate;
        this.vaccinationPackageStatus = vaccinationPackageStatus;
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

    public String getVaccinationPackageId() {
        return vaccinationPackageId;
    }

    public void setVaccinationPackageId(String vaccinationPackageId) {
        this.vaccinationPackageId = vaccinationPackageId;
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
