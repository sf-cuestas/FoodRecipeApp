package com.example.foodrecipeapp.app.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme

@Composable
fun TopBar(
    modifier: Modifier,
    leadIcon: @Composable (() -> Unit) = {},
    title: String?,
    endIcon: @Composable (() -> Unit) = {},
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = Padding.l, end = Padding.l, bottom = Padding.xl),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        leadIcon()

        title?.let {
            Text(text = it, style = TextStyleTheme.titleTextStyle)
        }
        Row() {
            endIcon()

            ProfileIcon("Test")
        }
    }
}