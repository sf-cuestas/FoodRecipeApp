package com.example.foodrecipeapp.api.data

import kotlinx.serialization.SerialName

data class AuthenticationResponse(
    @SerialName("access_token")
    val accessToken: String,
    @SerialName("expires_in")
    val secondsLeft: Int
)
