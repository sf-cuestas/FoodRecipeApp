package com.example.foodrecipeapp

import android.app.Application
import com.example.foodrecipeapp.api.NetworkModule
import com.example.foodrecipeapp.home.HomeModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class App : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                NetworkModule,
                HomeModule
            )
        }
    }
}