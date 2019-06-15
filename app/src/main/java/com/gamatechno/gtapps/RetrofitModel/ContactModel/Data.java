
package com.gamatechno.gtapps.RetrofitModel.ContactModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("current_page")
    @Expose
    private String currentPage;
    @SerializedName("prev_page")
    @Expose
    private Integer prevPage;
    @SerializedName("next_page")
    @Expose
    private String nextPage;
    @SerializedName("last_page")
    @Expose
    private Integer lastPage;
    @SerializedName("list_user")
    @Expose
    private List<ListUser> listUser = null;
    @SerializedName("list_group")
    @Expose
    private List<Object> listGroup = null;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(Integer prevPage) {
        this.prevPage = prevPage;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getLastPage() {
        return lastPage;
    }

    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

    public List<ListUser> getListUser() {
        return listUser;
    }

    public void setListUser(List<ListUser> listUser) {
        this.listUser = listUser;
    }

    public List<Object> getListGroup() {
        return listGroup;
    }

    public void setListGroup(List<Object> listGroup) {
        this.listGroup = listGroup;
    }

}
