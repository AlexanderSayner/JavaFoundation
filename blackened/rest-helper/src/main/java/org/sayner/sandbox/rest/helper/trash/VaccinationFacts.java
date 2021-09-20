package org.sayner.sandbox.rest.helper.trash;

import java.util.List;

public class VaccinationFacts {
    private List<VaccinationFact> vaccinationFact;

    public VaccinationFacts(List<VaccinationFact> vaccinationFact) {
        this.vaccinationFact = vaccinationFact;
    }

    public void setVaccinationFact(List<VaccinationFact> vaccinationFact){
        this.vaccinationFact = vaccinationFact;
    }
    public List<VaccinationFact> getVaccinationFact(){
        return this.vaccinationFact;
    }
}
