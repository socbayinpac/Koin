package com.example.koin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    val viewModel by viewModel<MainViewModel>() // tiem kieu lazy
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // check kiem tra da tiem databaseF
        viewModel.databaseF.let {
            Toast.makeText(applicationContext,"Da tiem thanh cong database vao vm",Toast.LENGTH_SHORT).show()
        }



    }
}
