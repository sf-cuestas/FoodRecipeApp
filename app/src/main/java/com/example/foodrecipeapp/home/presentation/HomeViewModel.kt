package com.example.foodrecipeapp.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodrecipeapp.home.domain.HomeController
import kotlinx.coroutines.launch

class HomeViewModel(val homeController: HomeController) : ViewModel() {

    fun tryConnection() {
        viewModelScope.launch {
            homeController.tryConnection()
        }
    }
}