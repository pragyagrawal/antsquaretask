package com.example.pragyaagrawal.antsquaretask.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pragya Agrawal on 12/2/2016.
 */

public class RetroClient {
    // Trailing slash is needed
    private static final String ANTSQUARE_URL = "https://core1.antsquare.com/v5/users/179/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ANTSQUARE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient.build())
                    .build();
        }
        return retrofit;
    }
}
