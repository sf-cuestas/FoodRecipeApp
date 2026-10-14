package com.example.foodrecipeapp.app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.ui.theme.ColorTheme

@Composable
fun SaveButton(isSelected: Boolean, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .width(50.dp)
            .height(50.dp)
            .clickable(onClick = onClick)
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(
                when (isSelected) {
                    true -> R.drawable.ic_bookmark
                    false -> R.drawable.ic_outline_bookmark
                }
            ),
            tint = ColorTheme.Primary,
            contentDescription = null
        )
    }
}

@Preview
@Composable
private fun SaveButtonPreview() {
    SaveButton(false) { }
}