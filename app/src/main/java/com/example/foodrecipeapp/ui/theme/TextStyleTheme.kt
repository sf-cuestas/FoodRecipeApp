package com.example.foodrecipeapp.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodrecipeapp.R


object TextStyleTheme {
    val Liberata = FontFamily(
        Font(R.font.literata_black, FontWeight.Black),
        Font(R.font.literata_medium, FontWeight.Medium),
        Font(R.font.literata_regular, FontWeight.Normal),
    )
    val paragraphTextStyle = TextStyle(
        color = Color.Black,
        fontSize = 13.sp,
        fontFamily = Liberata,
        fontWeight = FontWeight.Normal
    )
    val titleTextStyle = TextStyle(
        color = Color.Black,
        fontSize = 20.sp,
        fontFamily = Liberata,
        fontWeight = FontWeight.Bold
    )
    val subtitleTextStyle = TextStyle(
        color = Color.Black,
        fontSize = 16.sp,
        fontFamily = Liberata,
        fontWeight = FontWeight.Medium
    )
}