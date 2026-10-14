package com.example.foodrecipeapp.recipeDetail.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.components.Badge
import com.example.foodrecipeapp.ui.theme.MainBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarouselInfo() {
    data class CarouselItem(
        val id: Int,
        @DrawableRes
        val icon:Int,
        val contentDescription: String
    )

    val carouselItems = remember {
        listOf(
            CarouselItem(0, R.drawable.ic_star, "cupcake"),
            CarouselItem(1, R.drawable.ic_star, "donut"),
            CarouselItem(2, R.drawable.ic_star, "eclair"),
            CarouselItem(3, R.drawable.ic_star, "froyo"),
            CarouselItem(4, R.drawable.ic_star, "gingerbread"),
        )
    }

    HorizontalUncontainedCarousel(
        state = rememberCarouselState { carouselItems.count() },
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 16.dp, bottom = 16.dp),
        itemWidth = 128.dp,
        itemSpacing = 8.dp,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) { i ->
        val item = carouselItems[i]
        Badge(
            modifier = Modifier
                .maskClip(MaterialTheme.shapes.extraLarge),
            iconId = item.icon,
            text = item.contentDescription,
            backgroundColor = MainBackground
        )
    }
}