package com.example.foodrecipeapp.home

import com.example.foodrecipeapp.home.data.HomeRepository

class HomeController(val homeRepository: HomeRepository) {
    suspend fun tryConnection() {
        val result = homeRepository.tryConnection()
        result.fold(
            onSuccess = {},
            onFailure = {}
        )
    }
}