package com.example.foodrecipeapp.app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme

@Composable
fun ProfileIcon(profileName: String) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(Color.Cyan)
            .size(28.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = profileName.first().toString(), style = TextStyleTheme.paragraphTextStyle)
    }
}

@Composable
fun ProfileLabel(profileName: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Padding.s)
    ) {
        ProfileIcon(profileName)
        Text(
            text = stringResource(R.string.home_recipe_card_author, profileName),
            style = TextStyleTheme.paragraphTextStyle
        )
    }
}