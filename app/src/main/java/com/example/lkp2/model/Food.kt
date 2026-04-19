package com.example.lkp2.model
import androidx.annotation.DrawableRes

data class Food(
    val name: String,
    val price: String,
    @DrawableRes val imageRes: Int
)