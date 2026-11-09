package com.example.foodrecipeapp.api
import com.example.foodrecipeapp.BuildConfig
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class HeaderInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        var url = request.url.newBuilder()
            .build()
        request = request.newBuilder()
            .url(url)
            .addHeader("Authorization","Bearer ${BuildConfig.RECIPE_API_KEY} ")
            .build()
        return chain.proceed(request)
    }
}
