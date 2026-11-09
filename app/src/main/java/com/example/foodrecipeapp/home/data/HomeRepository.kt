package com.example.foodrecipeapp.home.data

import com.example.foodrecipeapp.api.ApiFood
import com.example.foodrecipeapp.api.data.RecipeResponse

class HomeRepository(val foodNetworkConnection: ApiFood) {
    suspend fun getRecipes(): Result<RecipeResponse> {
        return try {
            val result = foodNetworkConnection.getRecipes()
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }


}