package com.example.foodrecipeapp.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.Padding
import com.example.foodrecipeapp.app.components.Badge
import com.example.foodrecipeapp.app.components.SaveButton
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import com.example.foodrecipeapp.ui.theme.Primary

@Composable
fun BigFoodCard() {
    Card(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
    ) {
        FoodCardBackground()

    }

}

@Composable
private fun FoodCardBackground() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(R.drawable.background_test), contentDescription = null)
        Row(modifier = Modifier.fillMaxWidth().padding(Padding.m)) {
            Badge(text = "hola", backgroundColor = Primary)
            SaveButton(isSelected = true) { }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BigFoodCardPreview() {
    FoodRecipeAppTheme {
        BigFoodCard()
    }
}