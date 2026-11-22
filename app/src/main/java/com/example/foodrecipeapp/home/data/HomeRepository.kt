package com.example.foodrecipeapp.home.data

import com.example.foodrecipeapp.api.ApiFood
import com.example.foodrecipeapp.api.data.RecipeApiResponse

class HomeRepository(val foodNetworkConnection: ApiFood) {
    suspend fun getRecipes(authorization: String): Result<RecipeApiResponse> {
        return try {
            val result = foodNetworkConnection.getRecipes("Bearer $authorization")
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}