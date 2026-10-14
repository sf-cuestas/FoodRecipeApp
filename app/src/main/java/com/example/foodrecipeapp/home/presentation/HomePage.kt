package com.example.foodrecipeapp.home.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import com.example.foodrecipeapp.home.components.SmallFoodCard
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomePage(
    name: String,
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel = koinViewModel(),
    navigateTo: (id: String) -> Unit,
) {
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