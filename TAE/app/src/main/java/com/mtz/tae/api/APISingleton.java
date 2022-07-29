package com.mtz.tae.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APISingleton {
    private static final String BASE_URL = "http://juanmtz87-001-site1.itempurl.com";
    private static API instancia;

    private APISingleton() {

    }

    public static API getInstance() {
        if (instancia == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://juanmtz87-001-site1.itempurl.com")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();;
            instancia = retrofit.create(API.class);
        }
        return instancia;
    }
}
