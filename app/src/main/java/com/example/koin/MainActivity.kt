package com.example.koin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val viewModel by viewModel<MainViewModel>() // tiem kieu lazy

    val chuoi by inject<String>(named("string1"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // check kiem tra da tiem databaseF
        viewModel.databaseF.let {
        //    Toast.makeText(applicationContext,"Da tiem thanh cong database vao vm",Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(applicationContext,chuoi,Toast.LENGTH_LONG).show()

    }
}
