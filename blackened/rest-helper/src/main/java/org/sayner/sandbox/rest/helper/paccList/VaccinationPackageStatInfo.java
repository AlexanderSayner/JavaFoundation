package org.sayner.sandbox.rest.helper.paccList;

public class VaccinationPackageStatInfo {
    private int partProcessedCount;

    private int notProcessedCount;

    public VaccinationPackageStatInfo() {
    }

    public VaccinationPackageStatInfo(int partProcessedCount, int notProcessedCount) {
        this.partProcessedCount = partProcessedCount;
        this.notProcessedCount = notProcessedCount;
    }

    public void setPartProcessedCount(int partProcessedCount){
        this.partProcessedCount = partProcessedCount;
    }
    public int getPartProcessedCount(){
        return this.partProcessedCount;
    }
    public void setNotProcessedCount(int notProcessedCount){
        this.notProcessedCount = notProcessedCount;
    }
    public int getNotProcessedCount(){
        return this.notProcessedCount;
    }
}
