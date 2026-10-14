package com.example.foodrecipeapp.app

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp


data object TextStyleTheme{
    val paragraphTextStyle = TextStyle(
        color = Color.Black,
        fontSize = 13.sp
    )
    val titleTextStyle = TextStyle(
        color = Color.Black,
        fontSize = 20.sp
    )
    val subtitleTextStyle = TextStyle(
        color = Color.Black,
        fontSize = 16.sp
    )
}