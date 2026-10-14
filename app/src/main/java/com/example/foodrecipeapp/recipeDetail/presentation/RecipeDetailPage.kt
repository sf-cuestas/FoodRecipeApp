package com.example.foodrecipeapp.recipeDetail.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import com.example.foodrecipeapp.home.components.SmallFoodCard
import com.example.foodrecipeapp.recipeDetail.components.CarouselInfo

import com.example.foodrecipeapp.recipeDetail.components.RecipeInfoCard

@Composable
fun RecipeDetailPage(){
    Column {

        RecipeInfoCard()

    }
}