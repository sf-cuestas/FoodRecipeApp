package com.example.foodrecipeapp.api

import com.example.foodrecipeapp.api.data.AuthenticationResponse
import retrofit2.http.POST

interface AuthenticationFatSecret {
    @POST("token")
    suspend fun getAccessToken(): AuthenticationResponse
}