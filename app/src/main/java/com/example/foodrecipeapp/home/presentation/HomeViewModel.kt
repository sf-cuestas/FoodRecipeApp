package com.example.foodrecipeapp.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodrecipeapp.app.data.Recipe
import com.example.foodrecipeapp.home.domain.HomeController
import kotlinx.coroutines.launch

data class HomeUiState(
    val recipes : List<Recipe>? = null,
    val isLoading: Boolean = false,
    val error: Boolean? = null
)
class HomeViewModel(val homeController: HomeController) : ViewModel() {

    fun getRecipes() {
        viewModelScope.launch {
            homeController.getRecipes()
        }
    }
}