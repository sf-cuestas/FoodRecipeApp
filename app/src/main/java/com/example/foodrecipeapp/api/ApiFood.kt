package com.example.foodrecipeapp.api

import com.example.foodrecipeapp.api.data.RecipeResponse
import retrofit2.http.GET

interface ApiFood {
    @GET("recipes")
    suspend fun getRecipes(): RecipeResponse
}