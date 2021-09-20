package org.sayner.sandbox.rest.helper.getvaccpackage;

import java.util.List;

public class VaccinationFacts {

    private List<VaccinationFact> vaccinationFact;

    public VaccinationFacts(List<VaccinationFact> vaccinationFact) {
        this.vaccinationFact = vaccinationFact;
    }

    public VaccinationFacts() {
    }

    public List<VaccinationFact> getVaccinationFact() {
        return vaccinationFact;
    }

    public void setVaccinationFact(List<VaccinationFact> vaccinationFact) {
        this.vaccinationFact = vaccinationFact;
    }
}
