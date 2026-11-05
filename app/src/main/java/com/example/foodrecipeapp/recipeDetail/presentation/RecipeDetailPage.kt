package com.example.foodrecipeapp.recipeDetail.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import com.example.foodrecipeapp.home.components.SmallFoodCard
import com.example.foodrecipeapp.recipeDetail.components.CarouselInfo
import com.example.foodrecipeapp.recipeDetail.components.Ingredients

import com.example.foodrecipeapp.recipeDetail.components.RecipeInfoCard
import com.example.foodrecipeapp.ui.theme.Padding

@Composable
fun RecipeDetailPage(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(horizontal = Padding.l)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(Padding.s)
    ) {
        RecipeInfoCard()
        Ingredients()

    }
}