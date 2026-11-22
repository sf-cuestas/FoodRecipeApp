package com.example.foodrecipeapp.api

import com.example.foodrecipeapp.api.data.RecipeApiResponse
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiFood {
    @GET("recipes/search/v3")
    suspend fun getRecipes(@Header("Authorization") authorization: String): RecipeApiResponse
}