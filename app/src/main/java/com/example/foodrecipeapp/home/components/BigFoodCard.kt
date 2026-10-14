package com.example.foodrecipeapp.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.Padding
import com.example.foodrecipeapp.app.TextStyleTheme
import com.example.foodrecipeapp.app.components.Badge
import com.example.foodrecipeapp.app.components.ButtonIcon
import com.example.foodrecipeapp.app.components.ProfileLabel
import com.example.foodrecipeapp.app.components.SaveButton
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import com.example.foodrecipeapp.ui.theme.MainBackground
import com.example.foodrecipeapp.ui.theme.Neutral

@Composable
fun BigFoodCard(author: String) {
    Card(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .height(432.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(color = Color.White)
        ) {
            FoodCardBackground()
            GeneralRecipeInfo(
                modifier = Modifier.padding(top = Padding.l, start = Padding.l, end = Padding.l),
                rating = 4.9f,
                difficultyLevel = "Medium skill",
                calories = 520
            )
            Text(
                modifier = Modifier.padding(Padding.l),
                text = "Crispy pan-seared wild salmon tucked into a velvety parmesan, sweet garlic, and tart sun-dried tomato",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = TextStyleTheme.paragraphTextStyle
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = Padding.l),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ProfileLabel(author)
                ButtonIcon(text = stringResource(R.string.home_recipe_card_start)) {
                    Icon(painter = painterResource(R.drawable.ic_arrow), contentDescription = null)
                }
            }
        }
    }

}

@Composable
private fun FoodCardBackground() {
    var isSelected by remember { mutableStateOf(true) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(256.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.background_test),
            contentScale = ContentScale.FillBounds,
            contentDescription = null
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Padding.m),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Badge(text = "35 min", backgroundColor = MainBackground)
            SaveButton(isSelected = isSelected, onClick = { isSelected = !isSelected })
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(Padding.m)
        ) {
            Text(
                modifier = Modifier.padding(vertical = Padding.s),
                text = "RUSTIC MEDITERRANEAN",
                style = TextStyleTheme.subtitleTextStyle
            )
            Text(
                text = "Creamy Tuscan Garlic Sun-Dried\nTomato Salmon",
                style = TextStyleTheme.titleTextStyle
            )
        }
    }
}

@Composable
private fun GeneralRecipeInfo(
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
            style = TextStyleTheme.subtitleTextStyle.copy(color = Neutral)
        )
        Text(modifier = Modifier.padding(horizontal = Padding.m), text = "•", style = TextStyleTheme.subtitleTextStyle.copy(color = Neutral))
        Icon(
            modifier = Modifier.padding(start = Padding.xs, end = Padding.s),
            painter = painterResource(R.drawable.ic_cookin_skill),
            contentDescription = null
        )
        Text(difficultyLevel, style = TextStyleTheme.subtitleTextStyle.copy(color = Neutral))
        Text(modifier = Modifier.padding(horizontal = Padding.m), text = "•", style = TextStyleTheme.subtitleTextStyle.copy(color = Neutral))
        Text(stringResource(R.string.home_recipe_calorie, calories), style = TextStyleTheme.subtitleTextStyle.copy(color = Neutral))
    }
}

@Preview(showBackground = true)
@Composable
private fun BigFoodCardPreview() {
    FoodRecipeAppTheme {
        BigFoodCard("Marco")
    }
}