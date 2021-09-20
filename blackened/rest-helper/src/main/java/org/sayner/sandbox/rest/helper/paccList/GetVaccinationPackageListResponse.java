package org.sayner.sandbox.rest.helper.paccList;

import org.sayner.sandbox.rest.helper.PagingResults;

public class GetVaccinationPackageListResponse {
    private VaccinationPackageStatInfo vaccinationPackageStatInfo;

    private PagingResults pagingResults;

    private VaccinationPackageList vaccinationPackageList;

    public GetVaccinationPackageListResponse() {
    }

    public GetVaccinationPackageListResponse(VaccinationPackageStatInfo vaccinationPackageStatInfo, PagingResults pagingResults, VaccinationPackageList vaccinationPackageList) {
        this.vaccinationPackageStatInfo = vaccinationPackageStatInfo;
        this.pagingResults = pagingResults;
        this.vaccinationPackageList = vaccinationPackageList;
    }

    public VaccinationPackageStatInfo getVaccinationPackageStatInfo() {
        return vaccinationPackageStatInfo;
    }

    public void setVaccinationPackageStatInfo(VaccinationPackageStatInfo vaccinationPackageStatInfo) {
        this.vaccinationPackageStatInfo = vaccinationPackageStatInfo;
    }

    public PagingResults getPagingResults() {
        return pagingResults;
    }

    public void setPagingResults(PagingResults pagingResults) {
        this.pagingResults = pagingResults;
    }

    public VaccinationPackageList getVaccinationPackageList() {
        return vaccinationPackageList;
    }

    public void setVaccinationPackageList(VaccinationPackageList vaccinationPackageList) {
        this.vaccinationPackageList = vaccinationPackageList;
    }
}
