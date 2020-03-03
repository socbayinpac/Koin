package com.example.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App) // tiem context
            modules(arrayListOf(appModule, mainActivityModule, mainVMModule)) // khai bao nhung module su dung

        }
    }

}

