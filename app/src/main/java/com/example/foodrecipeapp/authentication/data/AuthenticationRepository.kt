package com.example.foodrecipeapp.authentication.data

import com.example.foodrecipeapp.api.AuthenticationFatSecret
import com.example.foodrecipeapp.api.data.AuthenticationResponse
import com.example.foodrecipeapp.api.data.FoodBrandsResponse

class AuthenticationRepository(val authenticationFatSecret: AuthenticationFatSecret) {
    suspend fun getAccessToken(): Result<AuthenticationResponse> {
        return try {
            val result = authenticationFatSecret.getAccessToken()
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}