package com.example.foodrecipeapp.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodrecipeapp.home.components.BigFoodCard
import com.example.foodrecipeapp.home.components.MediumFoodCard
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomePage(
    name: String,
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel = koinViewModel(),
    navigateTo: (id: String) -> Unit,
) {
    Column() {
        BigFoodCard("Marco")
        MediumFoodCard()
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