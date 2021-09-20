package org.sayner.sandbox.rest.helper.patientPackageList;

public class Attachment {
    private String moId;

    private String attachId;

    private String muId;

    private String areaId;

    private boolean isActual;

    private int attachTypeId;

    private String attachTypeName;

    public Attachment() {
    }

    public Attachment(String moId, String attachId, String muId, String areaId, boolean isActual, int attachTypeId, String attachTypeName) {
        this.moId = moId;
        this.attachId = attachId;
        this.muId = muId;
        this.areaId = areaId;
        this.isActual = isActual;
        this.attachTypeId = attachTypeId;
        this.attachTypeName = attachTypeName;
    }

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId;
    }

    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId;
    }

    public String getMuId() {
        return muId;
    }

    public void setMuId(String muId) {
        this.muId = muId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public boolean isActual() {
        return isActual;
    }

    public void setActual(boolean actual) {
        isActual = actual;
    }

    public int getAttachTypeId() {
        return attachTypeId;
    }

    public void setAttachTypeId(int attachTypeId) {
        this.attachTypeId = attachTypeId;
    }

    public String getAttachTypeName() {
        return attachTypeName;
    }

    public void setAttachTypeName(String attachTypeName) {
        this.attachTypeName = attachTypeName;
    }
}
