package com.example.foodrecipeapp.api.data

import kotlinx.serialization.SerialName
import java.time.LocalDateTime

data class AuthenticationResponse(
    @SerialName("access_token")
    val accessToken: String,
    @SerialName("expires_in")
    val secondsLeft: Long,
    var expDate: LocalDateTime = LocalDateTime.now()
) {
    fun isValid(): Boolean {
        return expDate.plusSeconds(secondsLeft).isAfter(LocalDateTime.now())
    }
}
