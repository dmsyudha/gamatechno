
package com.gamatechno.gtapps.RetrofitModel.ContactModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactModel {

    @SerializedName("gtfwResult")
    @Expose
    private GtfwResult gtfwResult;

    public GtfwResult getGtfwResult() {
        return gtfwResult;
    }

    public void setGtfwResult(GtfwResult gtfwResult) {
        this.gtfwResult = gtfwResult;
    }

}
