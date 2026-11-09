package com.example.foodrecipeapp.app.data

import kotlinx.serialization.Serializable

@Serializable
enum class IngredientType {
    vegetable,
    fruit,
    meat,
    poultry,
    fish,
    seafood,
    dairy,
    egg,
    grain,
    legume,
    herb,
    spice,
    oil,
    condiment,
    sweetener,
    nut,
    beverage,
    other
}