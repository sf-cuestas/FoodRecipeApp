package com.example.foodrecipeapp.api.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class AuthenticationResponse(
    //@SerialName("access_token")
    val access_token: String,
    //@SerialName("token_type")
    val token_type: String,
    //@SerialName("expires_in")
    val expires_in: Long,
    val scope: String
)

data class AuthenticationToken(
    val accessToken: String,
    var expDate: LocalDateTime? = null
) {
    fun isValid(): Boolean {
        return accessToken.isNotEmpty() && expDate?.isAfter(LocalDateTime.now()) ?: false
    }
}
