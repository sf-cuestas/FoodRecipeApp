package com.example.foodrecipeapp.authentication.injection

import com.example.foodrecipeapp.authentication.data.AuthenticationRepository
import org.koin.dsl.module

val AuthenticationModule = module {
    single { AuthenticationRepository(get()) }
}