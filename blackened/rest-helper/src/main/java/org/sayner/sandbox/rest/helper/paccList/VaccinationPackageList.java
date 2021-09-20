package org.sayner.sandbox.rest.helper.paccList;

import java.util.List;

public class VaccinationPackageList {
    private List<VaccinationPackageListItem> vaccinationPackageListItem;

    public VaccinationPackageList() {
    }

    public VaccinationPackageList(List<VaccinationPackageListItem> vaccinationPackageListItem) {
        this.vaccinationPackageListItem = vaccinationPackageListItem;
    }

    public void setVaccinationPackageListItem(List<VaccinationPackageListItem> vaccinationPackageListItem){
        this.vaccinationPackageListItem = vaccinationPackageListItem;
    }
    public List<VaccinationPackageListItem> getVaccinationPackageListItem(){
        return this.vaccinationPackageListItem;
    }
}
