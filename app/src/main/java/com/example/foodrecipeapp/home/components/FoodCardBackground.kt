package com.example.foodrecipeapp.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.Padding
import com.example.foodrecipeapp.app.TextStyleTheme
import com.example.foodrecipeapp.app.components.Badge
import com.example.foodrecipeapp.app.components.SaveButton
import com.example.foodrecipeapp.ui.theme.MainBackground

@Composable
fun FoodCardBackground(
    modifier: Modifier = Modifier,
    recipeTitle: String? = null,
    recipeSubtitle: String? = null,
    preparationTime: Int? = null
) {
    var isSelected by remember { mutableStateOf(true) }
    Box(modifier = modifier.fillMaxWidth()) {
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
            preparationTime?.let {
                Badge(
                    text = stringResource(R.string.home_recipe_card_preparation_time, it),
                    backgroundColor = MainBackground
                )
            }
            SaveButton(isSelected = isSelected, onClick = { isSelected = !isSelected })
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(Padding.m)
        ) {
            recipeSubtitle?.let {
                Text(
                    modifier = Modifier.padding(vertical = Padding.s),
                    text = it,
                    style = TextStyleTheme.subtitleTextStyle
                )
            }
            recipeTitle?.let {
                Text(
                    text = it,
                    style = TextStyleTheme.titleTextStyle
                )
            }
        }
    }
}