package com.example.foodrecipeapp.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.app.components.SearchBar
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import com.example.foodrecipeapp.home.components.SmallFoodCard
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import com.example.foodrecipeapp.ui.theme.TextStyleTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomePage(
    name: String,
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel = koinViewModel(),
    navigateTo: (id: String) -> Unit,
) {
    Column {
        val textFieldState = rememberTextFieldState()
        Text(
            stringResource(R.string.home_title, "Felipe"),
            style = TextStyleTheme.titleTextStyle.copy(fontSize = 34.sp)
        )
        SearchBar(
            textFieldState = textFieldState,
            searchResults = null,
            onSearch = {})

        LazyColumn {
            item {
                BigFoodCard("Marco")
            }
            item {
                MediumFoodCard()
            }
            item {
                SmallFoodCard()
            }
            item {
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
    }
}

@Preview
@Composable
private fun HomePagePreview() {
    FoodRecipeAppTheme {
        HomePage(name = "felipe", navigateTo = {})
    }
}