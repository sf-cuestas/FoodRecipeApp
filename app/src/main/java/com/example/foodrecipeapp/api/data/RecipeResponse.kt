package com.example.foodrecipeapp.api.data

import com.example.foodrecipeapp.app.data.Recipe
import kotlinx.serialization.Serializable

@Serializable
data class RecipeResponse(
   val data: List<Recipe>
)