package com.example.koin

import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainViewModel(val helloService: HelloService ): ViewModel(),KoinComponent {
    val databaseF: DatabaseF by inject()
}