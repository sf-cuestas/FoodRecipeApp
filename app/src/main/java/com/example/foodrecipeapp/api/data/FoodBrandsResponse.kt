package com.example.foodrecipeapp.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("food_brands")
data class FoodBrandsResponse(
    @SerialName("food_brand")
    val foodBrands: List<String>
)
