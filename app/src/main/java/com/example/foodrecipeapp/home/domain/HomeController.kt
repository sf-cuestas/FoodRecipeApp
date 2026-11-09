package com.example.foodrecipeapp.home.domain

import com.example.foodrecipeapp.authentication.data.AuthenticationRepository
import com.example.foodrecipeapp.home.data.HomeRepository

class HomeController(val homeRepository: HomeRepository, val authenticationRepository: AuthenticationRepository) {
    suspend fun tryConnection() {
        val result = homeRepository.tryConnection()
        result.fold(
            onSuccess = {},
            onFailure = {}
        )
    }

    suspend fun getAccessToken() {
        val result = authenticationRepository.getAccessToken()
        result.fold(
            onSuccess = {},
            onFailure = {}
        )
    }
}