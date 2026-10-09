package com.example.foodrecipeapp.api

import retrofit2.http.GET

interface ApiFood {
    @GET("food/v5?")
    suspend fun tryConnection(): Unit
}