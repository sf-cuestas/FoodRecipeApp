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
            FoodCardBackground(
                modifier = Modifier.height(256.dp),
                recipeSubtitle = "RUSTIC MEDITERRANEAN",
                recipeTitle = "Creamy Tuscan Garlic Sun-Dried\nTomato Salmon",
                preparationTime = 35
            )
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

@Preview(showBackground = true)
@Composable
private fun BigFoodCardPreview() {
    FoodRecipeAppTheme {
        BigFoodCard("Marco")
    }
}