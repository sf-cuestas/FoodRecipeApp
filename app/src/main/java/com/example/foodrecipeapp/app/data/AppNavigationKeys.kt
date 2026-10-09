package com.example.foodrecipeapp.app.data

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

enum class MainTab {
    HOME, SEARCH, PROFILE;

//    @DrawableRes
//    var icon = get()when () {
//        HOME -> R.drawable.ic_home,
//        SEARCH -> R.drawable.outline_search_24
//
//            ,
//        PROFILE -> R.drawable.ic_profile
//
//    }
}

@Serializable
sealed interface HomeKey : NavKey

@Serializable
data object Home : HomeKey

@Serializable
data class HomeDetail(val id: String) : HomeKey

@Serializable
data object Search : NavKey

@Serializable
data object Profile : NavKey