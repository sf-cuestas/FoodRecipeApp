package com.example.foodrecipeapp.api

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val AuthenticationNetworkModule = module {
    single {
        OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .addInterceptor(AuthenticationHeaderInterceptor())
            .build()
    }
    single<Retrofit> {
        Retrofit.Builder()
            .client(get())
            .baseUrl("https://oauth.fatsecret.com/connect/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single<AuthenticationFatSecret> {
        get<Retrofit>().create(AuthenticationFatSecret::class.java)
    }
}