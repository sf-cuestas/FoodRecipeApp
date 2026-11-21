package com.example.foodrecipeapp.authentication.data

import com.example.foodrecipeapp.api.AuthenticationFatSecret
import com.example.foodrecipeapp.api.data.AuthenticationResponse
import java.time.LocalDateTime

class AuthenticationRepository(val authenticationFatSecret: AuthenticationFatSecret) {
    suspend fun fetchAccessToken(): Result<AuthenticationResponse> {
        return try {
            val result = authenticationFatSecret.getAccessToken()
            result.expDate = LocalDateTime.now().plusSeconds(result.secondsLeft)
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}