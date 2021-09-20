package org.sayner.sandbox.rest.helper.patientPackageList;

import org.sayner.sandbox.rest.helper.PagingOptions;

public class GetPatientVaccinationPackageListRequest {
    private String author;

    private int emiasId;

    private PagingOptions pagingOptions;

    private String vaccinationPackageStatus;

    public GetPatientVaccinationPackageListRequest() {
    }

    public GetPatientVaccinationPackageListRequest(String author, int emiasId, PagingOptions pagingOptions, String vaccinationPackageStatus) {
        this.author = author;
        this.emiasId = emiasId;
        this.pagingOptions = pagingOptions;
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEmiasId() {
        return emiasId;
    }

    public void setEmiasId(int emiasId) {
        this.emiasId = emiasId;
    }

    public PagingOptions getPagingOptions() {
        return pagingOptions;
    }

    public void setPagingOptions(PagingOptions pagingOptions) {
        this.pagingOptions = pagingOptions;
    }

    public String getVaccinationPackageStatus() {
        return vaccinationPackageStatus;
    }

    public void setVaccinationPackageStatus(String vaccinationPackageStatus) {
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }
}
