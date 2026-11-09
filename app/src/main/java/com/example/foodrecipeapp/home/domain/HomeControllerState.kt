package com.example.foodrecipeapp.home.domain

import com.example.foodrecipeapp.app.data.Recipe

data class HomeControllerState(
    val recipes : List<Recipe>? = null,
    val isLoading: Boolean = false,
    val error: Boolean? = null
)
