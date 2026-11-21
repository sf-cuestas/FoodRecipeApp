package com.example.foodrecipeapp.authentication.injection

import com.example.foodrecipeapp.authentication.data.AuthenticationRepository
import com.example.foodrecipeapp.authentication.domain.AuthenticationController
import org.koin.dsl.module

val AuthenticationModule = module {
    single { AuthenticationRepository(get()) }
    single { AuthenticationController(get()) }
}