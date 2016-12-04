package com.example.pragyaagrawal.antsquaretask.network;

import com.example.pragyaagrawal.antsquaretask.interfaces.AntsquareAPIInterface;
import com.example.pragyaagrawal.antsquaretask.models.ProductDataModel;
import com.example.pragyaagrawal.antsquaretask.models.UserDataModel;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by Pragya Agrawal on 12/3/2016.
 */

public class AntsquareAPI {

    public static void getUserInfo(Callback<UserDataModel> callback) {
        AntsquareAPIInterface antsquareAPIInterface = RetroClient.getRetrofit().create(AntsquareAPIInterface.class);
        Call<UserDataModel> call = antsquareAPIInterface.getUserInfo();
        call.enqueue(callback);
    }

    public static void getPhotos(Callback<ProductDataModel> callback) {
        AntsquareAPIInterface antsquareAPIInterface = RetroClient.getRetrofit().create(AntsquareAPIInterface.class);
        Call<ProductDataModel> call = antsquareAPIInterface.getProductData();
        call.enqueue(callback);
    }
}
