package com.example.foodrecipeapp.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.components.Badge
import com.example.foodrecipeapp.app.components.SearchBar
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import com.example.foodrecipeapp.home.components.SmallFoodCard
import com.example.foodrecipeapp.home.data.FastSearch
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomePage(
    name: String,
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel = koinViewModel(),
    navigateTo: (id: String) -> Unit,
) {
    Column(
        modifier = modifier
            .padding(horizontal = Padding.l)
            .verticalScroll(rememberScrollState())
    ) {
        val textFieldState = rememberTextFieldState()
        Text(
            stringResource(R.string.home_title, "Felipe"),
            style = TextStyleTheme.titleTextStyle.copy(fontSize = 28.sp)
        )

        SearchBar(
            textFieldState = textFieldState,
            searchResults = null,
            onSearch = {})

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = Padding.l),
            horizontalArrangement = Arrangement.spacedBy(Padding.s)
        ) {
            items(FastSearch.entries) { entry ->
                Badge(
                    text = entry.text,
                    backgroundColor = Color.White
                )
            }
        }

        Column(
            modifier = Modifier.padding(vertical = Padding.xxl),
            verticalArrangement = Arrangement.spacedBy(Padding.s)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(Padding.s)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_fire),
                        tint = ColorTheme.Primary,
                        contentDescription = null
                    )

                    Text(
                        text = stringResource(R.string.home_daily_choice_title),
                        style = TextStyleTheme.paragraphTextStyle.copy(color = ColorTheme.Primary)
                    )
                }

                Text(
                    text = stringResource(R.string.home_updated_daily),
                    style = TextStyleTheme.paragraphTextStyle.copy(color = ColorTheme.Neutral)
                )
            }
            BigFoodCard("Marco")
        }

        QuickRecipes()

        TrendingRecipes()

        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Button(onClick = {
            homeViewModel.tryConnection()
            navigateTo("sudkud")
        }) {
            Text("sdafdsf")
        }
    }
}

@Composable
private fun QuickRecipes() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .padding(bottom = Padding.m)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = stringResource(R.string.home_quick_dinners_title),
                    style = TextStyleTheme.titleTextStyle
                )
                Text(
                    text = stringResource(R.string.home_quick_dinners_subtitle),
                    style = TextStyleTheme.paragraphTextStyle
                )
            }

            Text(
                text = stringResource(R.string.see_all),
                style = TextStyleTheme.paragraphTextStyle.copy(color = ColorTheme.Primary)
            )
        }

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(Padding.m)
        ) {
            item {
                MediumFoodCard(modifier = Modifier.width(256.dp))
            }
            item {
                MediumFoodCard(modifier = Modifier.width(256.dp))
            }
            item {
                MediumFoodCard(modifier = Modifier.width(256.dp))
            }
        }
    }
}

@Composable
private fun TrendingRecipes() {
    Column(modifier = Modifier.fillMaxWidth().padding(vertical = Padding.m)) {
        Row(
            modifier = Modifier
                .padding(bottom = Padding.m)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = stringResource(R.string.home_trending_recipes_title),
                    style = TextStyleTheme.titleTextStyle
                )
                Text(
                    text = stringResource(R.string.home_trending_recipes_subtitle),
                    style = TextStyleTheme.paragraphTextStyle
                )
            }

            Icon(
                modifier = Modifier.size(15.dp),
                painter = painterResource(R.drawable.ic_improvement),
                tint = ColorTheme.Primary,
                contentDescription = null
            )
        }

        Row(
            modifier = Modifier
                .padding(vertical = Padding.m)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SmallFoodCard(modifier = Modifier.width(173.dp))
            SmallFoodCard(modifier = Modifier.width(173.dp))
        }

        Row(
            modifier = Modifier
                .padding(vertical = Padding.m)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SmallFoodCard(modifier = Modifier.width(173.dp))
            SmallFoodCard(modifier = Modifier.width(173.dp))
        }
    }
}

@Preview
@Composable
private fun HomePagePreview() {
    FoodRecipeAppTheme {
        HomePage(name = "felipe", navigateTo = {})
    }
}