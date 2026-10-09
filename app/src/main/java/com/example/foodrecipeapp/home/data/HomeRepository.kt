package com.example.foodrecipeapp.home.data

import com.example.foodrecipeapp.api.ApiFood
import com.example.foodrecipeapp.api.data.FoodBrandsResponse

class HomeRepository(val foodNetworkConnection: ApiFood) {
    suspend fun tryConnection(): Result<FoodBrandsResponse> {
        return try {
            val result = foodNetworkConnection.tryConnection()
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}