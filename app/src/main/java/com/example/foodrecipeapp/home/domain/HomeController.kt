package com.example.foodrecipeapp.home.domain

import com.example.foodrecipeapp.authentication.data.AuthenticationRepository
import com.example.foodrecipeapp.home.data.HomeRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeController(
    val homeRepository: HomeRepository,
    val authenticationRepository: AuthenticationRepository
) {
    private val _homeControllerState = MutableStateFlow(HomeControllerState())
    val homeControllerState = _homeControllerState.asStateFlow()

    suspend fun getRecipes() {
        val result = homeRepository.getRecipes()
        _homeControllerState.update { state ->
            state.copy(isLoading = true)
        }
        _homeControllerState.update { state ->
            result.fold(
                onSuccess = { data->
                    state.copy(recipes = data.data, isLoading = false)
                },
                onFailure = {
                    state.copy(isLoading = false, error = true)
                }
            )
        }
    }

    suspend fun getAccessToken() {
        val result = authenticationRepository.getAccessToken()
        result.fold(
            onSuccess = {},
            onFailure = {}
        )
    }
}