package com.example.foodrecipeapp.api.data

import com.example.foodrecipeapp.app.data.Recipe
import kotlinx.serialization.Serializable

@Serializable
data class RecipeApiResponse(
    val recipes: RecipeResponse
)

@Serializable
data class RecipeResponse(
    val max_results: String,
    val page_number: String,
    val recipe: List<Recipe>,
    val total_results: String
)