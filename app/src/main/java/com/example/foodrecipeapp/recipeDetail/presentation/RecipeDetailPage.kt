package com.example.foodrecipeapp.recipeDetail.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodrecipeapp.recipeDetail.components.CookingStepInfo
import com.example.foodrecipeapp.recipeDetail.components.IngredientsInfo

import com.example.foodrecipeapp.recipeDetail.components.RecipeInfoCard
import com.example.foodrecipeapp.recipeDetail.presentation.viewmodel.RecipeViewModel
import com.example.foodrecipeapp.ui.theme.Padding
import org.koin.androidx.compose.koinViewModel

@Composable
fun RecipeDetailPage(
    recipeViewModel: RecipeViewModel = koinViewModel(),
    modifier: Modifier = Modifier
){

    Column(
        modifier = modifier
            .padding(horizontal = Padding.l)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(Padding.s)
    ) {
        RecipeInfoCard()
        IngredientsInfo()
        CookingStepInfo()


    }

}