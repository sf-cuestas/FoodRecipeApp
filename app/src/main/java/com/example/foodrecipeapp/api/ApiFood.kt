package com.example.foodrecipeapp.api

import retrofit2.http.GET

interface ApiFood {
    @GET("pokemon/ditto")
    suspend fun tryConnection(): Unit
}