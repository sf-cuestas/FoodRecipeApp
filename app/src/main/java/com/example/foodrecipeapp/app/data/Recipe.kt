package com.example.foodrecipeapp.app.data

import kotlinx.serialization.Serializable

@Serializable
data class Recipe(
    val recipe_description: String?,
    val recipe_id: String?,
    val recipe_image: String?,
    val recipe_ingredients: RecipeIngredients,
    val recipe_name: String?,
    val recipe_nutrition: RecipeNutrition,
    val recipe_types: RecipeType
)

@Serializable
data class RecipeIngredients(
    val ingredient: List<String>
)

@Serializable
data class RecipeNutrition(
    val calories: String?,
    val carbohydrate: String?,
    val fat: String?,
    val protein: String?,
)

@Serializable
data class RecipeType(val recipe_type: List<String?>)