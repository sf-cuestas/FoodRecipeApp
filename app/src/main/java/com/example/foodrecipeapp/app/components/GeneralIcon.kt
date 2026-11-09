package com.example.foodrecipeapp.app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.ColorTheme.Primary
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme

@Composable
fun GeneralIcon(color: Color,secondColor: Color ,iconId: Int? = null, text : String?) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .width(25.dp)
            .height(25.dp)
            .background(color = color),
        contentAlignment = Alignment.Center

    ) {
        iconId?.let {
            Icon(
                modifier = Modifier,
                painter = painterResource(iconId),
                tint = secondColor,
                contentDescription = null
            )
        }
        if (text != null) {
            Text(
                modifier = Modifier,
                text = text,
                style = TextStyleTheme.subtitleTextStyle.copy(
                    color = secondColor,
                    fontSize = 12.sp
                ))
        }
    }
}