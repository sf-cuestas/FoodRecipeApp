package com.example.foodrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodrecipeapp.home.HomeViewModel
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodRecipeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel = koinViewModel()
) {
    LaunchedEffect(Unit) {
        homeViewModel.tryConnection()
    }
    Column() {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Button(onClick = { homeViewModel.tryConnection() }) {
            Text("sdafdsf")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodRecipeAppTheme {
        Greeting("Android")
    }
}