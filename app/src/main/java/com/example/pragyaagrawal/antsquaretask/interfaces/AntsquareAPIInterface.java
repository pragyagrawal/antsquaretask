package com.example.pragyaagrawal.antsquaretask.interfaces;

import com.example.pragyaagrawal.antsquaretask.models.ProductDataModel;
import com.example.pragyaagrawal.antsquaretask.models.UserDataModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Pragya Agrawal on 12/3/2016.
 */

public interface AntsquareAPIInterface {

    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("mpview")
    Call<UserDataModel> getUserInfo();

    @GET("resources")
    Call<ProductDataModel> getProductData();
}
