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
fun CookingStepInfo(
    modifier: Modifier = Modifier,
    recipeViewModel: RecipeViewModel = koinViewModel()
) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Padding.m),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.padding(start = Padding.s, end = Padding.m),
            text = "Cooking Steps",
            style = TextStyleTheme.titleTextStyle
        )

        Text(
            modifier = Modifier.padding(start = Padding.s, end = Padding.m),
            text = "3 steps",
            style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
        )
    }

    Column(
        modifier = Modifier
        ,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        CookingStepDetail(
            modifier = Modifier,
            cookingName = "Sear the Salmon Fillets",
            cookingDescription = "Pat salmon completely dry with paper" +
                    " towels; season generously with coarse" +
                    " sea salt and cracked black pepper. Heat" +
                    " olive oil in a deep skillet over medium-" +
                    "high heat. Sear salmon flesh-side down" +
                    " for 5 minutes undisturbed until crisp and" +
                    " golden brown, then flip gently and" +
                    " transfer to a side plate.",
            recipeViewModel = recipeViewModel
        )

        CookingStepDetail(
            modifier = Modifier,
            cookingName = "Sear the Salmon Fillets",
            cookingDescription = "Pat salmon completely dry with paper" +
                    " towels; season generously with coarse" +
                    " sea salt and cracked black pepper. Heat" +
                    " olive oil in a deep skillet over medium-" +
                    "high heat. Sear salmon flesh-side down" +
                    " for 5 minutes undisturbed until crisp and" +
                    " golden brown, then flip gently and" +
                    " transfer to a side plate.",
            recipeViewModel = recipeViewModel
        )

        CookingStepDetail(
            modifier = Modifier,
            cookingName = "Sear the Salmon Fillets",
            cookingDescription = "Pat salmon completely dry with paper" +
                    " towels; season generously with coarse" +
                    " sea salt and cracked black pepper. Heat" +
                    " olive oil in a deep skillet over medium-" +
                    "high heat. Sear salmon flesh-side down" +
                    " for 5 minutes undisturbed until crisp and" +
                    " golden brown, then flip gently and" +
                    " transfer to a side plate.",
            recipeViewModel = recipeViewModel
        )

    }
}

