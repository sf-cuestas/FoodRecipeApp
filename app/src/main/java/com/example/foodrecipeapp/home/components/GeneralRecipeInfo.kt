package com.example.foodrecipeapp.home.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme

@Composable
fun GeneralRecipeInfo(
    modifier: Modifier = Modifier,
    rating: Float,
    difficultyLevel: String,
    calories: Int
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_star),
            tint = Color.Yellow,
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(start = Padding.s, end = Padding.m),
            text = rating.toString(),
            style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
        )
        Text(
            modifier = Modifier.padding(horizontal = Padding.m),
            text = "•",
            style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
        )
        Icon(
            modifier = Modifier.padding(start = Padding.xs, end = Padding.s),
            painter = painterResource(R.drawable.ic_cookin_skill),
            tint = ColorTheme.Neutral,
            contentDescription = null
        )
        Text(difficultyLevel, style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral))
        Text(
            modifier = Modifier.padding(horizontal = Padding.m),
            text = "•",
            style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
        )
        Text(
            stringResource(R.string.home_recipe_calorie, calories),
            style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
        )
    }
}