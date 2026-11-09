package com.example.foodrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.foodrecipeapp.app.components.TopBar
import com.example.foodrecipeapp.app.data.Home
import com.example.foodrecipeapp.app.data.HomeDetail
import com.example.foodrecipeapp.app.data.MainTab
import com.example.foodrecipeapp.app.data.Profile
import com.example.foodrecipeapp.app.data.Search
import com.example.foodrecipeapp.home.presentation.HomeDetailPage
import com.example.foodrecipeapp.home.presentation.HomePage
import com.example.foodrecipeapp.home.presentation.ProfilePage
import com.example.foodrecipeapp.recipeDetail.presentation.RecipeDetailPage
import com.example.foodrecipeapp.ui.theme.ColorTheme
import com.example.foodrecipeapp.ui.theme.FoodRecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppMain()
        }
    }
}

@Composable
fun FoodAppMain() {
    var selectedTab by rememberSaveable { mutableStateOf(MainTab.HOME) }
    val homeBackStack = rememberNavBackStack(Home)
    val profileBackStack = rememberNavBackStack(Profile)
    val searchBackStack = rememberNavBackStack(Search)
    FoodRecipeAppTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(color = ColorTheme.MainBackground),
            bottomBar = {
                NavigationBar {
                    MainTab.entries.forEach { entry ->
                        NavigationBarItem(
                            selected = selectedTab.name == entry.name,
                            onClick = { selectedTab = entry },
                            icon = {
                                Icon(
                                    painter = painterResource(entry.iconResource),
                                    contentDescription = null
                                )
                            },
                            label = { Text(text = entry.name) }
                        )
                    }
                }

            },
            topBar = {
                TopBar(
                    modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars),
                    leadIcon = {
                        Icon(
                            painter = painterResource(R.drawable.ic_arrow),
                            contentDescription = null
                        )
                    },
                    title = "Explore"
                )
            }
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                when (selectedTab) {
                    MainTab.HOME -> NavDisplay(
                        backStack = homeBackStack,
                        entryProvider = entryProvider {
                            entry<Home> {
                                HomePage("Home page", navigateToRecipeDetail = { id ->
                                    homeBackStack.add(
                                        HomeDetail(id)
                                    )
                                })
                            }
                            entry<HomeDetail> {
                                RecipeDetailPage("")
                            }
                        })

                    MainTab.SEARCH -> NavDisplay(
                        backStack = searchBackStack,
                        entryProvider = entryProvider {
                            entry<Search> { RecipeDetailPage("Recipe Page") }
                        })

                    MainTab.PROFILE -> NavDisplay(
                        backStack = profileBackStack,
                        entryProvider = entryProvider {
                            entry<Profile> { ProfilePage() }
                        })
                }
            }

        }
    }
}
