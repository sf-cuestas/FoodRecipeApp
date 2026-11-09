package com.example.foodrecipeapp.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Recipe(
    val id: String?,
    val name: String?,
    val description: String?,
    val difficulty: Difficulty?,
    @SerialName("meal_type")
    val mealType: MealType?,
    val cuisine: CuisineType?,
    @SerialName("dietary_tags")
    val dietaryTag: DietaryTag?,
    val servings: Int?,
    @SerialName("prep_time")
    val preparationTime: Int?,
    @SerialName("cook_time")
    val cookingTime: Int?,
    @SerialName("calories_per_serving")
    val caloriesPerServing: Int?,
    val protein: Int?,
    val instructions: List<String>?,
    val ingredients: List<Ingredient>,
)