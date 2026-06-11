package com.example.lkp2.data.api

import com.example.lkp2.data.model.Food
import retrofit2.http.GET

interface ApiService {
    // Pastikan string di bawah ini persis dengan nama file di GitHub Gist Anda
    @GET("menu_makanan.json")
    suspend fun getFoods(): List<Food>
}