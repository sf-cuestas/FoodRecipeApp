package com.example.foodrecipeapp.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.foodrecipeapp.app.data.HomeDetail

@Composable
fun HomeDetailPage(id: String) {
    Column() {
        Text(
            text = "Hello $id",
        )
    }
}