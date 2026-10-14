package com.example.foodrecipeapp.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.app.Padding
import com.example.foodrecipeapp.app.TextStyleTheme
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme

@Composable
fun MediumFoodCard() {
    Card(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White)
        ) {
            FoodCardBackground(
                modifier = Modifier.height(144.dp),
                preparationTime = 35
            )
            GeneralRecipeInfo(
                modifier = Modifier.padding(top = Padding.m, start = Padding.m, end = Padding.m),
                rating = 4.9f,
                difficultyLevel = "Medium skill",
                calories = 520
            )
            Text(
                modifier = Modifier.padding(Padding.m),
                text = "Crispy Honey Soy Tofu Bowls",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = TextStyleTheme.titleTextStyle
            )
            Text(
                modifier = Modifier.padding(vertical = Padding.s, horizontal = Padding.m),
                text = "Crispy pan-seared wild salmon tucked into a velvety parmesan, sweet garlic, and tart sun-dried tomato",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = TextStyleTheme.paragraphTextStyle
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MediumFoodCardPreview() {
    FoodRecipeAppTheme {
        MediumFoodCard()
    }
}