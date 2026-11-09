package com.example.foodrecipeapp.recipeDetail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.app.components.GeneralIcon
import com.example.foodrecipeapp.recipeDetail.presentation.viewmodel.RecipeViewModel
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun CookingStepDetail(
    modifier: Modifier = Modifier,
    cookingName: String,
    cookingDescription: String,
    recipeViewModel: RecipeViewModel = koinViewModel(),

) {
    Row(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .fillMaxWidth()
            .padding(Padding.l)
            ,

    ) {

        GeneralIcon(
            color = ColorTheme.Primary,
            secondColor = Color.White,
            iconId = null,
            text = "1"
        )

        Column(
            modifier = Modifier

        ) {
            Text(
                modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                text = cookingName,
                style = TextStyleTheme.titleTextStyleV2
            )
            Text(
                modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                text = cookingDescription,
                style = TextStyleTheme.paragraphTextStyle
            )
        }
    }
}