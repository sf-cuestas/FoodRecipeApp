package com.example.foodrecipeapp.recipeDetail.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodrecipeapp.home.domain.HomeController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.collections.copy

class RecipeViewModel(val homeController: HomeController) : ViewModel() {

    val uiState = MutableStateFlow(RecipeUIState(0))
    fun addIngredientsCount() {
        viewModelScope.launch {

            uiState.update { currentState ->
                currentState.copy(
                    countedIngredients = currentState.countedIngredients + 1)
            }


        }
    }

    fun removeIngredientsCount() {
        viewModelScope.launch {

            uiState.update { currentState ->
                currentState.copy(
                    countedIngredients = currentState.countedIngredients - 1)
            }


        }
    }


}