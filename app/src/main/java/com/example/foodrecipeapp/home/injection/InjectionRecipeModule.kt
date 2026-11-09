package com.example.foodrecipeapp.home.injection

import com.example.foodrecipeapp.recipeDetail.presentation.viewmodel.RecipeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val RecipeModule = module {

    viewModelOf(::RecipeViewModel)
}