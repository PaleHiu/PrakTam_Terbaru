package com.example.lkp2.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    // URL ini sudah diatur sesuai Gist Anda
    private const val BASE_URL = "https://gist.githubusercontent.com/PaleHiu/3abe9c97341c62a05286d12f1eacd6f8/raw/064eaaf912e471d4c880d8caceb8371e73e6ef7f/"

    val instance: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}