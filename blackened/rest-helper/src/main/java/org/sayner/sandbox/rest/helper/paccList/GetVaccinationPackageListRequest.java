package org.sayner.sandbox.rest.helper.paccList;

import org.sayner.sandbox.rest.helper.PagingOptions;

import java.util.List;

public class GetVaccinationPackageListRequest {
    private String author;

    private int medicalFacilityId;

    private String vaccinationPackageStatus;

    private List<String> attachmentAreaIds;

    private PagingOptions pagingOptions;

    private DatePeriod datePeriod;

    public GetVaccinationPackageListRequest(String author, int medicalFacilityId, String vaccinationPackageStatus, List<String> attachmentAreaIds, PagingOptions pagingOptions, DatePeriod datePeriod) {
        this.author = author;
        this.medicalFacilityId = medicalFacilityId;
        this.vaccinationPackageStatus = vaccinationPackageStatus;
        this.attachmentAreaIds = attachmentAreaIds;
        this.pagingOptions = pagingOptions;
        this.datePeriod = datePeriod;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMedicalFacilityId(int medicalFacilityId) {
        this.medicalFacilityId = medicalFacilityId;
    }

    public int getMedicalFacilityId() {
        return this.medicalFacilityId;
    }

    public void setVaccinationPackageStatus(String vaccinationPackageStatus) {
        this.vaccinationPackageStatus = vaccinationPackageStatus;
    }

    public String getVaccinationPackageStatus() {
        return this.vaccinationPackageStatus;
    }

    public void setAttachmentAreaIds(List<String> attachmentAreaIds) {
        this.attachmentAreaIds = attachmentAreaIds;
    }

    public List<String> getAttachmentAreaIds() {
        return this.attachmentAreaIds;
    }

    public PagingOptions getPagingOptions() {
        return pagingOptions;
    }

    public void setPagingOptions(PagingOptions pagingOptions) {
        this.pagingOptions = pagingOptions;
    }

    public void setDatePeriod(DatePeriod datePeriod) {
        this.datePeriod = datePeriod;
    }

    public DatePeriod getDatePeriod() {
        return this.datePeriod;
    }
}
