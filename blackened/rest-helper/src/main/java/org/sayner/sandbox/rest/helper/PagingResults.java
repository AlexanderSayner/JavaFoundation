package org.sayner.sandbox.rest.helper;

public class PagingResults {
    private Integer pageSize;
    private Integer totalItemsCount;
    private Boolean morePagesAvailable;
    private Integer pageNumber;
    private Integer pageTotal;

    public PagingResults() {
    }

    public PagingResults(Integer pageSize, Integer totalItemsCount, Boolean morePagesAvailable, Integer pageNumber, Integer pageTotal) {
        this.pageSize = pageSize;
        this.totalItemsCount = totalItemsCount;
        this.morePagesAvailable = morePagesAvailable;
        this.pageNumber = pageNumber;
        this.pageTotal = pageTotal;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalItemsCount() {
        return totalItemsCount;
    }

    public void setTotalItemsCount(Integer totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
    }

    public Boolean getMorePagesAvailable() {
        return morePagesAvailable;
    }

    public void setMorePagesAvailable(Boolean morePagesAvailable) {
        this.morePagesAvailable = morePagesAvailable;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }
}
