package com.example.foodrecipeapp.api

import com.example.foodrecipeapp.BuildConfig
import okhttp3.Credentials
import okhttp3.FormBody
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthenticationHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val body = FormBody.Builder()
            //.add("scope", "basic")
            .add("grant_type", "client_credentials")
            .build()
        val credentials = Credentials.basic(
            username = BuildConfig.FATSECRET_PUBLIC_CLIENT_ID,
            password = BuildConfig.FATSECRET_SECRET_CLIENT_ID
        )
        var request: Request = chain.request()
        request = request.newBuilder()
            .addHeader("Authorization", credentials)
            .post(body)
            .build()
        return chain.proceed(request)
    }
}