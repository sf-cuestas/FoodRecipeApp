package com.example.foodrecipeapp.recipeDetail.components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodrecipeapp.app.components.Badge
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.ColorTheme.MainBackground
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme

@Composable
fun IngredientsCheck(
    modifier: Modifier = Modifier,
    ingredientName: String,
    quantity: String,
    onClickAction: () -> Unit
) {
    var isSelected by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(12.dp)
            )
            .fillMaxWidth()
            .padding(Padding.l)
            .clickable(onClick = {
                onClickAction()
                isSelected = !isSelected
            }),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier.clip(CircleShape)
                .size(25.dp)
                .background(if (isSelected) ColorTheme.Secondary else Color.Gray)
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
            if (isSelected) {
                IndicatorIsSelected()
            }

        }
        Text(
            modifier = Modifier.padding(start = Padding.s, end = Padding.m),
            text = quantity,
            style = TextStyleTheme.subtitleTextStyle.copy(color = ColorTheme.Neutral)
        )

    }
}
    @Composable
    fun IndicatorIsSelected() {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(

                painter = painterResource(com.example.foodrecipeapp.R.drawable.ic_pantry),
                contentDescription = null
            )
            Text(
                modifier = Modifier.padding(start = Padding.s, end = Padding.m),
                text = "is selected",
                style = TextStyleTheme.subtitleTextStyle.copy(
                    color = ColorTheme.Neutral,
                    fontSize = 12.sp
                ),

                )
        }
    }



