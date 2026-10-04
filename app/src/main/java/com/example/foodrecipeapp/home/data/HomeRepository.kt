package com.example.foodrecipeapp.home.data

import com.example.foodrecipeapp.api.ApiFood

class HomeRepository(val foodNetworkConnection: ApiFood) {
    suspend fun tryConnection(): Result<Unit> {
        return try {
            val result = foodNetworkConnection.tryConnection()
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}