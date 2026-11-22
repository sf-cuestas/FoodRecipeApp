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
    suspend fun getRecipes(): Result<Unit> =
        getAccessToken().onSuccess { token ->
            _homeControllerState.update { state ->
                state.copy(isLoading = true)
            }

            val result = homeRepository.getRecipes(token)
            _homeControllerState.update { state ->
                result.fold(
                    onSuccess = { data ->
                        state.copy(recipes = data.recipes.recipe, isLoading = false)
                    },
                    onFailure = {
                        state.copy(isLoading = false, error = true)
                    }
                )
            }
        }.map {}

    suspend fun getAccessToken(): Result<String> {
        val token = authenticationRepository.getToken()
        if (token.isValid()) {
            return Result.success(token.accessToken)
        }
        return authenticationRepository.fetchAccessToken().fold(
            onSuccess = { response -> Result.success(response.access_token) },
            onFailure = { Result.success("") }
        )
    }

}