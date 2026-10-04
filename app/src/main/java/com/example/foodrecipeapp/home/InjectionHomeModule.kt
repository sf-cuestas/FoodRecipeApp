package com.example.foodrecipeapp.home

import com.example.foodrecipeapp.home.data.HomeRepository
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val HomeModule = module {
    single { HomeRepository(get()) }
    single { HomeController(get()) }

    viewModelOf(::HomeViewModel)
}