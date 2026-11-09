package com.example.foodrecipeapp.api.data

import kotlinx.serialization.Serializable

@Serializable
data class RecipeResponse(
   val data: List<Recipe>
)

@Serializable
data class Recipe(
    val id: String?,
    val name: String?
)