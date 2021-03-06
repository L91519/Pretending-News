package com.example.user.pretendingnews.network;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 2017-10-29.
 */

public class APIAdapter {

    protected static Object retrofit(Context context, Class<?> serviceName) {
        OkHttpClient client = new OkHttpClient.Builder()
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://13.124.104.217:5000/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit.create(serviceName);
    }
}
