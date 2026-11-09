package com.example.foodrecipeapp.recipeDetail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.foodrecipeapp.recipeDetail.presentation.viewmodel.RecipeViewModel
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun IngredientsInfo(
    modifier: Modifier = Modifier,
    recipeViewModel: RecipeViewModel = koinViewModel()
) {
    val uiState = recipeViewModel.uiState.collectAsStateWithLifecycle()
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
                style = TextStyleTheme.titleTextStyle
            )
            val count = uiState.value.countedIngredients
            Text(
                modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                text = "$count / 5",
                style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
            )
        }
        Column(
            modifier = Modifier
                .padding(Padding.m),
            verticalArrangement = Arrangement.spacedBy(16.dp)
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