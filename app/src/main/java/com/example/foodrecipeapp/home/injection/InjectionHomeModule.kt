package com.example.foodrecipeapp.home.injection

import com.example.foodrecipeapp.home.presentation.HomeViewModel
import com.example.foodrecipeapp.home.data.HomeRepository
import com.example.foodrecipeapp.home.domain.HomeController
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val HomeModule = module {
    single { HomeRepository(get()) }
    single { HomeController(get()) }

    viewModelOf(::HomeViewModel)
}