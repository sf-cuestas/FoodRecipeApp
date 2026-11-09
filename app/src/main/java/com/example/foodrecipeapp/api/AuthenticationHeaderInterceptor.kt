package com.example.foodrecipeapp.api

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthenticationHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val credentials = Credentials.basic(
            username = "8e53375538ca4290bef6e0c07dea5b86",
            password = "a4b3aa046c934f5e94fdcd896052eeca"
        )
        var request: Request = chain.request()
        var url = request.url.newBuilder()
            .addQueryParameter("grant_type", "client_credentials")
            .addQueryParameter("scope", "basic")
            .build()
        request = request.newBuilder()
            .url(url)
            .addHeader("Authorization", credentials)
            .build()
        return chain.proceed(request)
    }
}