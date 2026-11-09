package com.example.foodrecipeapp.api

import okhttp3.OkHttpClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val NetworkModule = module {
    single(named("apiOkHttpClient")) {
        OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .addInterceptor(HeaderInterceptor())
            .build()
    }
    single<Retrofit>(named("apiRetrofit")) {
        Retrofit.Builder()
            .client(get(named("apiOkHttpClient")))
            .baseUrl("https://recipeapi.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single<ApiFood> {
        get<Retrofit>(named("apiRetrofit")).create(ApiFood::class.java)
    }
}