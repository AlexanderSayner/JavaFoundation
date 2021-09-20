package org.sayner.sandbox.rest.helper.trash;

public class PatientInfo {
    private int emiasId;

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
