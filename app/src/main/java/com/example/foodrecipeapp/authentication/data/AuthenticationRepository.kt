package com.example.foodrecipeapp.authentication.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.foodrecipeapp.api.AuthenticationFatSecret
import com.example.foodrecipeapp.api.data.AuthenticationResponse
import com.example.foodrecipeapp.api.data.AuthenticationToken
import kotlinx.coroutines.flow.first
import java.time.LocalDateTime

class AuthenticationRepository(
    val authenticationFatSecret: AuthenticationFatSecret,
    private val dataStore: DataStore<Preferences>
) {
    private object Keys {
        val ACCESS_TOKEN = stringPreferencesKey("access_token")
        val EXPIRES_AT = stringPreferencesKey("expires_at")
    }

    suspend fun fetchAccessToken(): Result<AuthenticationResponse> {
        return try {
            val result = authenticationFatSecret.getAccessToken()
            saveToken(result.access_token, LocalDateTime.now().plusSeconds(result.expires_in))
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun saveToken(token: String, expiresAt: LocalDateTime) {
        dataStore.edit {
            it[Keys.ACCESS_TOKEN] = token
            it[Keys.EXPIRES_AT] = expiresAt.toString()
        }
    }

    suspend fun getToken(): AuthenticationToken {
        val data = dataStore.data.first()
        val token = data[Keys.ACCESS_TOKEN]
        val expireAt = data[Keys.EXPIRES_AT]
        return try {
            AuthenticationToken(accessToken = token ?: "", expDate = LocalDateTime.parse(expireAt))
        } catch (_: Throwable) {
            AuthenticationToken(accessToken = "", expDate = null)
        }
    }
}