package com.example.foodrecipeapp.recipeDetail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.components.Badge
import com.example.foodrecipeapp.app.components.SaveButton
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme

@Composable
fun Ingredients(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
            .background(color = Color.White
                    ,shape = RoundedCornerShape(12.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Padding.m),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                text = "Ingredients",
                style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
            )
            Text(
                modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                text = "Ingredients",
                style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
            )
        }
        Column(
            modifier = Modifier
                .padding(Padding.m)
        ) {
            IngredientsCheck(
                modifier = Modifier,
                ingredientName = "Salmon fillets (6 oz each, skin-on)",
                quantity = "4 fillets",
                onClickAction = {}
            )
            IngredientsCheck(
                modifier = Modifier,
                ingredientName = "Salmon fillets (6 oz each, skin-on)",
                quantity = "4 fillets",
                onClickAction = {
                }
            )
            IngredientsCheck(
                modifier = Modifier,
                ingredientName = "Salmon fillets (6 oz each, skin-on)",
                quantity = "4 fillets",
                onClickAction = {
                }
            )
            IngredientsCheck(
                modifier = Modifier,
                ingredientName = "Salmon fillets (6 oz each, skin-on)",
                quantity = "4 fillets",
                onClickAction = {
                }
            )
            IngredientsCheck(
                modifier = Modifier,
                ingredientName = "Salmon fillets (6 oz each, skin-on)",
                quantity = "4 fillets",
                onClickAction = {
                }
            )

        }
    }
}