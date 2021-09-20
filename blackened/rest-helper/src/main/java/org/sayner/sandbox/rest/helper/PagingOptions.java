package org.sayner.sandbox.rest.helper;

import javax.validation.constraints.Min;
import java.util.List;

public class PagingOptions {
    @Min(value = 1) private Integer pageSize;
    private Integer pageNumber = 0;
    private SortingOptions sortingOptions;

    public PagingOptions() {
    }

    public PagingOptions(@Min(value = 1) Integer pageSize, Integer pageNumber, SortingOptions sortingOptions) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.sortingOptions = sortingOptions;
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public SortingOptions getSortingOptions() {
        return sortingOptions;
    }

    public void setSortingOptions(SortingOptions sortingOptions) {
        this.sortingOptions = sortingOptions;
    }
}
