package com.koen.weatheropenapi

import android.app.Application
import com.koen.weatheropenapi.di.component.AppCompo
import com.koen.weatheropenapi.di.component.DaggerAppCompo

class App: Application() {
    lateinit var injector: AppCompo
        private set
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        injector = DaggerAppCompo.builder()
            .build()
    }
    companion object {
        private var INSTANCE: App? = null
        @JvmStatic
        fun get(): App = INSTANCE!!
    }

}