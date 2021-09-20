package org.sayner.sandbox.rest.helper.getvaccpackage;

public class VaccinationInfections {
    private String infectionName;

    private int infectionId;

    private String frequency;

    public VaccinationInfections() {
    }

    public VaccinationInfections(String infectionName, int infectionId, String frequency) {
        this.infectionName = infectionName;
        this.infectionId = infectionId;
        this.frequency = frequency;
    }

    public String getInfectionName() {
        return infectionName;
    }

    public void setInfectionName(String infectionName) {
        this.infectionName = infectionName;
    }

    public int getInfectionId() {
        return infectionId;
    }

    public void setInfectionId(int infectionId) {
        this.infectionId = infectionId;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
