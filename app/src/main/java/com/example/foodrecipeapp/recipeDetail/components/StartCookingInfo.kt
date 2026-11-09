package com.example.foodrecipeapp.recipeDetail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.components.ButtonIcon
import com.example.foodrecipeapp.recipeDetail.presentation.viewmodel.RecipeViewModel
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun StartCookingInfo(
    modifier: Modifier = Modifier,
    numberOfStep: Int ,
    preparationTime: Int,
    recipeViewModel: RecipeViewModel = koinViewModel()
) {
    Row(
        modifier = Modifier.fillMaxWidth()
        .background(color = Color.White
            ,shape = RoundedCornerShape(12.dp))
            .padding(Padding.m),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column() {
            Text(modifier = Modifier,
                text = "READY TO COOK",
                style = TextStyleTheme.subtitleTextStyle
            )
            Row() {
                Text(
                    modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                    text = "$numberOfStep Steps",
                    style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
                )
                Text(
                    modifier = Modifier.padding(horizontal = Padding.m),
                    text = "•",
                    style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
                )
                Text(
                    modifier = Modifier.padding(horizontal = Padding.m),
                    text = "$preparationTime m",
                    style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
                )
            }
        }
        ButtonIcon(text = stringResource(R.string.home_recipe_card_start), onClick = {}, icon =  {
            Icon(painter = painterResource(R.drawable.ic_arrow), contentDescription = null)
        })
    }

}