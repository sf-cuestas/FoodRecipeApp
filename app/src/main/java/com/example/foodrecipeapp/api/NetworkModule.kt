package com.example.foodrecipeapp.api

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val NetworkModule = module {
    single {
        OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .addInterceptor(HeaderInterceptor())
            .build()
    }
    single<Retrofit> {
        Retrofit.Builder()
            .client(get())
            .baseUrl("https://platform.fatsecret.com/rest/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single<ApiFood> {
        get<Retrofit>().create(ApiFood::class.java)
    }
}