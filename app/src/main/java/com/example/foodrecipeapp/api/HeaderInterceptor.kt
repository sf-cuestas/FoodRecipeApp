package com.example.foodrecipeapp.api

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class HeaderInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        request = request.newBuilder()
            .addHeader("Authorization:Bearer ","8e53375538ca4290bef6e0c07dea5b86" )
            .build()
        return chain.proceed(request)
    }
}
