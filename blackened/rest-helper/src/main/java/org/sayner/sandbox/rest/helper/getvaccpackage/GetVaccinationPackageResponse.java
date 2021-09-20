package org.sayner.sandbox.rest.helper.getvaccpackage;

public class GetVaccinationPackageResponse {
    private VaccinationPackage vaccinationPackage;

    public GetVaccinationPackageResponse() {
    }

    public GetVaccinationPackageResponse(VaccinationPackage vaccinationPackage) {
        this.vaccinationPackage = vaccinationPackage;
    }

    public VaccinationPackage getVaccinationPackage() {
        return vaccinationPackage;
    }

    public void setVaccinationPackage(VaccinationPackage vaccinationPackage) {
        this.vaccinationPackage = vaccinationPackage;
    }
}
