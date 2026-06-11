package com.example.lkp2.data.model

// Ini adalah baris yang hilang/tidak terbaca sebelumnya
import com.google.gson.annotations.SerializedName

data class Food(
    @SerializedName("nama") val name: String,
    @SerializedName("deskripsi") val description: String,
    @SerializedName("harga") val price: Int,
    @SerializedName("image_url") val imageUrl: String
)