package com.example.foodrecipeapp.authentication.injection

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.example.foodrecipeapp.authentication.data.AuthenticationRepository
import com.example.foodrecipeapp.authentication.domain.AuthenticationController
import com.example.foodrecipeapp.dataStore
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val AuthenticationModule = module {
    single<DataStore<Preferences>> { androidContext().dataStore }
    single { AuthenticationRepository(get(), get()) }
    single { AuthenticationController(get()) }
}