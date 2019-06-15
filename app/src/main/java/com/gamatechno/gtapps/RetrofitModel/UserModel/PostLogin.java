package com.gamatechno.gtapps.RetrofitModel.UserModel;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface PostLogin {

    @POST("/auth/login")
    Call<UserModel> loginAction();
}