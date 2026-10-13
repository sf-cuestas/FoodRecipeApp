package com.example.foodrecipeapp.app.components

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.app.Padding
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import com.example.foodrecipeapp.ui.theme.MainBackground

@Composable
fun Badge(modifier: Modifier = Modifier, text: String, backgroundColor: Color) {
    Box(
        modifier = modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(24.dp))
            .background(color = backgroundColor)
    ) {
        Text(
            modifier = Modifier.padding(horizontal = Padding.m, vertical = Padding.s),
            text = text,
            color = Color.Black
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun BadgePreview() {
    FoodRecipeAppTheme {
        Badge(text = "35 minutes", backgroundColor = MainBackground)
    }
}