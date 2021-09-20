package org.sayner.sandbox.rest.helper.paccList;

public class GetVaccPackageListSortOrder {
    private String attributeName;
    private Boolean descending;

    public GetVaccPackageListSortOrder(String attributeName, Boolean descending) {
        this.attributeName = attributeName;
        this.descending = descending;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public Boolean getDescending() {
        return descending;
    }

    public void setDescending(Boolean descending) {
        this.descending = descending;
    }
}
