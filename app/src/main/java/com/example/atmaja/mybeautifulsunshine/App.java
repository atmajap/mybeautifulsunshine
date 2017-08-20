package com.example.atmaja.mybeautifulsunshine;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by atmaja on 20/08/17.
 */

public class App extends Application {
    private static App instance;
    private Gson gson;
    private Retrofit retrofit;
    public App(){
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        createRetrofit();
        createGson();
    }

    private void createGson() {
        gson = new GsonBuilder().create();
    }

    private void createRetrofit() {
        retrofit = new Retrofit.Builder().baseUrl(BaseUrl.BASE_URL_WEATHER).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static App getInstance() {
        return instance;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public Gson getGson() {
        return gson;
    }
}
