package com.example.foodrecipeapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel(val homeController: HomeController) : ViewModel() {

    fun tryConnection() {
        viewModelScope.launch {
            homeController.tryConnection()
        }
    }
}