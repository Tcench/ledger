package rick.ledger.util;

public class QueryBase {
    private int page = 1;

    private int pageSize = 10;

    private String sortBy;

    private String sortMethod;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortMethod() {
        return sortMethod;
    }

    public void setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
    }

    public String getLimitString() {

        if (pageSize > 0 & page > 0) {
            return ((page * pageSize) - pageSize) + "," + pageSize;
        }
        return "";
    }
}
