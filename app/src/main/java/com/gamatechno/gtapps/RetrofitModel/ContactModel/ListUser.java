
package com.gamatechno.gtapps.RetrofitModel.ContactModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListUser {

    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("user_key")
    @Expose
    private String userKey;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("user_username")
    @Expose
    private String userUsername;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("user_photo")
    @Expose
    private String userPhoto;
    @SerializedName("user_online")
    @Expose
    private Integer userOnline;
    @SerializedName("user_location")
    @Expose
    private String userLocation;
    @SerializedName("user_flag")
    @Expose
    private String userFlag;
    @SerializedName("user_distance")
    @Expose
    private String userDistance;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Integer getUserOnline() {
        return userOnline;
    }

    public void setUserOnline(Integer userOnline) {
        this.userOnline = userOnline;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    public String getUserDistance() {
        return userDistance;
    }

    public void setUserDistance(String userDistance) {
        this.userDistance = userDistance;
    }

}
