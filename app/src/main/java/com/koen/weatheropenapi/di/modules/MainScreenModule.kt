package com.koen.weatheropenapi.di.modules

import com.koen.weatheropenapi.abstracts.service.WeatherService
import com.koen.weatheropenapi.api.WeatherApi
import com.koen.weatheropenapi.api.WeatherImpl
import com.koen.weatheropenapi.ui.activity.MainScreenContract
import com.koen.weatheropenapi.ui.activity.MainScreenPresenter
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class MainScreenModule() {
    @Provides
    fun providesPresenter(weatherService: WeatherService):
            MainScreenPresenter = MainScreenPresenter(weatherService)
    @Provides
    @Singleton
    fun providesWeatherService(): MainScreenContract.Service {
        return WeatherService()
    }
}