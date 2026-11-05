package com.example.foodrecipeapp.api

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class HeaderInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        var url = request.url.newBuilder()
            .addQueryParameter(name = "format", value = "json")
            .build()
        request = request.newBuilder()
            .url(url)
            .addHeader("Authorization","Bearer d47ff796a48748b7acc3cbfdf2b4e1c3" )
            .build()
        return chain.proceed(request)
    }
}
