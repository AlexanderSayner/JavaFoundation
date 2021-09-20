package org.sayner.sandbox.rest.helper.patientPackageList;

import org.sayner.sandbox.rest.helper.PagingResults;

import java.util.List;

public class GetPatientVaccinationPackageListResponse {
    private List<VaccinationPackageListItem> vaccinationPackageListItem;

    private PagingResults pagingResults;

    private PatientInfo patientInfo;

    public GetPatientVaccinationPackageListResponse() {
    }

    public GetPatientVaccinationPackageListResponse(List<VaccinationPackageListItem> vaccinationPackageListItem, PagingResults pagingResults, PatientInfo patientInfo) {
        this.vaccinationPackageListItem = vaccinationPackageListItem;
        this.pagingResults = pagingResults;
        this.patientInfo = patientInfo;
    }

    public List<VaccinationPackageListItem> getVaccinationPackageListItem() {
        return vaccinationPackageListItem;
    }

    public void setVaccinationPackageListItem(List<VaccinationPackageListItem> vaccinationPackageListItem) {
        this.vaccinationPackageListItem = vaccinationPackageListItem;
    }

    public PagingResults getPagingResults() {
        return pagingResults;
    }

    public void setPagingResults(PagingResults pagingResults) {
        this.pagingResults = pagingResults;
    }

    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }
}
