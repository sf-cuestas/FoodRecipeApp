package com.example.foodrecipeapp.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.components.SearchBar
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import com.example.foodrecipeapp.home.components.SmallFoodCard
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import com.example.foodrecipeapp.ui.theme.Padding
import com.example.foodrecipeapp.ui.theme.TextStyleTheme
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
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

        Column(
            modifier = Modifier.padding(vertical = Padding.xxl),
            verticalArrangement = Arrangement.spacedBy(
                Padding.s
            )
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
        MediumFoodCard()
        SmallFoodCard()

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

@Preview
@Composable
private fun HomePagePreview() {
    FoodRecipeAppTheme {
        HomePage(name = "felipe", navigateTo = {})
    }
}