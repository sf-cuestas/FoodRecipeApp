package com.example.foodrecipeapp.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodrecipeapp.app.data.Recipe
import com.example.foodrecipeapp.home.domain.HomeController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class HomeUiState(
    val recipes: List<Recipe>? = null,
    val isLoading: Boolean = false,
    val error: Boolean? = null
)

class HomeViewModel(val homeController: HomeController) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState = _uiState.asStateFlow()

    fun getRecipes() {
        viewModelScope.launch {
            homeController.getRecipes().onSuccess {
                _uiState.update { state ->
                    state.copy(recipes = homeController.homeControllerState.value.recipes)
                }
            }
        }
    }
}