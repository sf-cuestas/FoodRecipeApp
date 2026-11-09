package com.example.foodrecipeapp.app.data

import kotlinx.serialization.Serializable

@Serializable
data class Ingredient(
    val id: Int,
    val name: String?,
    val category: IngredientType?,
    val quantity: Int?,
    val unit: String?,
    val optional: Boolean?
)
