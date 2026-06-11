package com.example.lkp2.data.repository

import com.example.lkp2.data.api.RetrofitClient
import com.example.lkp2.data.model.Food

class FoodRepository {
    suspend fun getFoods(): List<Food> {
        return try {
            RetrofitClient.instance.getFoods()
        } catch (e: Exception) {
            emptyList()
        }
    }
}