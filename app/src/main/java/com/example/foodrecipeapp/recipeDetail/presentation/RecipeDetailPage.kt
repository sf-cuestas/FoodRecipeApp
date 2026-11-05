package com.example.foodrecipeapp.recipeDetail.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.foodrecipeapp.app.components.ButtonIcon
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import com.example.foodrecipeapp.home.components.SmallFoodCard
import com.example.foodrecipeapp.recipeDetail.components.CarouselInfo
import com.example.foodrecipeapp.recipeDetail.components.Ingredients

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
        Ingredients()



    }

}