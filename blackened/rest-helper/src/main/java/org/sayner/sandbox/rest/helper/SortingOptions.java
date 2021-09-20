package org.sayner.sandbox.rest.helper;

import org.sayner.sandbox.rest.helper.paccList.GetVaccPackageListSortOrder;

import java.util.List;

public class SortingOptions {
    private List<GetVaccPackageListSortOrder> sortOrder;

    public SortingOptions() {
    }

    public SortingOptions(List<GetVaccPackageListSortOrder> sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<GetVaccPackageListSortOrder> getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(List<GetVaccPackageListSortOrder> sortOrder) {
        this.sortOrder = sortOrder;
    }
}
