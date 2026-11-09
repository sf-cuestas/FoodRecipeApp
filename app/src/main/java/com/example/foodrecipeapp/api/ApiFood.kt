package com.example.foodrecipeapp.api

import com.example.foodrecipeapp.api.data.FoodBrandsResponse
import com.example.foodrecipeapp.api.data.RecipeResponse
import retrofit2.http.GET

interface ApiFood {
    @GET("v1/recipes")
    suspend fun tryConnection(): RecipeResponse
}