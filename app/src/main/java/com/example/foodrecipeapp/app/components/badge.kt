package com.example.foodrecipeapp.app.components

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun Badge(modifier: Modifier = Modifier, text: String, backgroundColor: Color) {
    Box(modifier = modifier
        .clip(RoundedCornerShape(24.dp))
        .background(color = backgroundColor)) {
        Text(text = text)
    }

}