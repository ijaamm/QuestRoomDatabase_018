package com.example.praktikum9

import android.app.Application
import com.example.praktikum9.dependenciesinjection.ContainerApp
import com.example.praktikum9.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this)
    }

}