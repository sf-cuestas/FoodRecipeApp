package com.example.foodrecipeapp.home.data


enum class FastSearch {
    UNDER_30_MINUTES, PLANT_BASED, PASTA, JAPANESE;

    val text: String
        get() = when (this) {
            UNDER_30_MINUTES -> "⚡ Under 30 mins"
            PLANT_BASED -> "\uD83C\uDF31 Plant-based"
            PASTA -> "\uD83C\uDF5D Fresh Pasta"
            JAPANESE -> "\uD83C\uDF5D Japanese"
        }
}