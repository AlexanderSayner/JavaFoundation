package org.sayner.sandbox.rest.helper.paccList;

public class PatientInfo {
    private int emiasId;

    public PatientInfo() {
    }

    public PatientInfo(int emiasId) {
        this.emiasId = emiasId;
    }

    public void setEmiasId(int emiasId){
        this.emiasId = emiasId;
    }
    public int getEmiasId(){
        return this.emiasId;
    }
}
