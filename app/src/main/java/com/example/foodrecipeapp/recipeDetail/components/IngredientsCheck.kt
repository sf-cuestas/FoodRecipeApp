package com.example.foodrecipeapp.recipeDetail.components

import android.R
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
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme

@Composable
fun IngredientsCheck(
    modifier: Modifier = Modifier,
    check: Boolean,
    ingredientName: String,
    quantity: String,
    onClickAction: () -> Unit
) {
    var checkBox = ColorTheme.Secondary
    if (check) {
        checkBox = ColorTheme.Secondary
    }else{
        checkBox = Color.Gray
    }
        Row(
            modifier = Modifier
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(12.dp)
                )
                .fillMaxWidth()
                .padding(Padding.m)
                .clickable(onClick = onClickAction)
                ,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier.clip(CircleShape)
                    .size(25.dp)
                    .background(checkBox)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {

                Text(
                    modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                    text = ingredientName,
                    style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
                )
                Text(
                    modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                    text = "in your pantry",
                    style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
                )

            }
            Text(
                modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                text = quantity,
                style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
            )
        }
}