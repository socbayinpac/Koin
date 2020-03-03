package com.example.koin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

interface HelloService {
    fun hello(): String
}


class HelloServiceImpl(private val helloMessageData: HelloMessageData) : HelloService {

    override fun hello() = "Hey, ${helloMessageData.message}"
}


class HelloMessageData {
    val message: String = "temp"
}


val appModule = module {
        single { HelloMessageData() } // cung cap cho koin 1 doi tuong kieu Hll
    }

val mainVMModule = module {
    single<HelloService> { HelloServiceImpl(get()) }// cung cap hello service
    single { DatabaseF() }
}

val mainActivityModule = module {
    viewModel { MainViewModel(get()) }
}
