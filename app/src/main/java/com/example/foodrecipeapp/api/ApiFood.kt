package com.example.foodrecipeapp.api

import com.example.foodrecipeapp.api.data.FoodBrandsResponse
import retrofit2.http.GET

interface ApiFood {
    @GET("brands/v2")
    suspend fun tryConnection(): FoodBrandsResponse
}