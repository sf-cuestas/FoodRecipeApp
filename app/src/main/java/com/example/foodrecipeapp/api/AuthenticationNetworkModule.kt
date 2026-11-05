package com.example.foodrecipeapp.api

import okhttp3.OkHttpClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val AuthenticationNetworkModule = module {
    single(named("authOkHttpClient")) {
        OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .addInterceptor(AuthenticationHeaderInterceptor())
            .build()
    }
    single<Retrofit>(named("authRetrofit")) {
        Retrofit.Builder()
            .client(get(named("authOkHttpClient")))
            .baseUrl("https://oauth.fatsecret.com/connect/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single<AuthenticationFatSecret> {
        get<Retrofit>(named("authRetrofit")).create(AuthenticationFatSecret::class.java)
    }
}