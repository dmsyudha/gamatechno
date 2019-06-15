
package com.gamatechno.gtapps.RetrofitModel.UserModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

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
