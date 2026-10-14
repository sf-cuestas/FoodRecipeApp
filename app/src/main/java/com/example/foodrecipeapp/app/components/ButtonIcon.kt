package com.example.foodrecipeapp.app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.Padding
import com.example.foodrecipeapp.ui.theme.Primary


@Composable
fun ButtonIcon(
    modifier: Modifier = Modifier,
    text: String,
    isEnable: Boolean = true,
    icon: @Composable () -> Unit
) {
    Button(
        modifier = modifier,
        enabled = isEnable,
        colors = ButtonColors(
            contentColor = Color.White,
            containerColor = Primary,
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.White
        ),
        onClick = {}) {
        Row(
            modifier = Modifier
                .padding(horizontal = Padding.l)
                .alpha(
                    when (isEnable) {
                        true -> 1f
                        false -> 0.5f
                    }
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(modifier = Modifier.padding(end = Padding.s), text = text)
            icon()
        }
    }
}

@Preview
@Composable
private fun ButtonIconPreview() {
    ButtonIcon(text = "test", isEnable = false) {
        Icon(painter = painterResource(R.drawable.ic_arrow), contentDescription = null)
    }
}