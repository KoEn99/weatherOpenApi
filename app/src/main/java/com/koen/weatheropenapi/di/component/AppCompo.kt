package com.koen.weatheropenapi.di.component

import com.koen.weatheropenapi.abstracts.service.WeatherService
import com.koen.weatheropenapi.di.modules.MainScreenModule
import com.koen.weatheropenapi.di.modules.RetrofitModule
import com.koen.weatheropenapi.ui.activity.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(MainScreenModule::class, RetrofitModule::class))
@Singleton
interface AppCompo {
    fun inject(mainActivity: MainActivity)
    fun inject(weatherService: WeatherService)
}