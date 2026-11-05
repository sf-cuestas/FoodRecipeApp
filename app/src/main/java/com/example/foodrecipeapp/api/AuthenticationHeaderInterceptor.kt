package com.example.foodrecipeapp.api

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthenticationHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        var url = request.url.newBuilder()
            .username("8e53375538ca4290bef6e0c07dea5b86")
            .password("a4b3aa046c934f5e94fdcd896052eeca")
            .addQueryParameter("grant_type", "client_credentials")
            .addQueryParameter("scope", "basic")
            //.addQueryParameter(name = "format", value = "json")
            .build()
        request = request.newBuilder()
            .url(url)
            .build()
        return chain.proceed(request)
    }
}