package com.example.foodrecipeapp.app.data

import kotlinx.serialization.Serializable

@Serializable
enum class MealType {
    starter,
    main,
    dessert,
    appetizer,
    breakfast,
    brunch,
    snack,
    side_dish,
    soup,
    drink,
    sauce
}