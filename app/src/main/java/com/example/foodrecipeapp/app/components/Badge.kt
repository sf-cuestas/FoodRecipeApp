package com.example.foodrecipeapp.app.components

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.Padding
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import com.example.foodrecipeapp.ui.theme.MainBackground
import com.example.foodrecipeapp.ui.theme.Primary

@Composable
fun Badge(
    modifier: Modifier = Modifier,
    iconId: Int? = null,
    text: String,
    backgroundColor: Color
) {
    Box(
        modifier = modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(24.dp))
            .background(color = backgroundColor)
    ) {
        Row() {
            iconId?.let {
                Icon(
                    modifier = Modifier.padding(horizontal = Padding.m, vertical = Padding.s),
                    painter = painterResource(iconId),
                    tint = Primary,
                    contentDescription = null
                )
            }

            Text(
                modifier = Modifier.padding(horizontal = Padding.m, vertical = Padding.s),
                text = text,
                color = Color.Black
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun BadgePreview() {
    FoodRecipeAppTheme {
        Badge(text = "35 minutes", backgroundColor = ColorTheme.MainBackground)
    }
}