package com.koen.weatheropenapi.ui.activity

import com.koen.weatheropenapi.abstracts.presenter.BasePresenter
import com.koen.weatheropenapi.abstracts.service.WeatherService
import javax.inject.Inject

class MainScreenPresenter @Inject constructor(var weatherService: WeatherService):
    BasePresenter<MainScreenContract.View>(),
    MainScreenContract.Presenter {
    override fun generateText(str: String) {
        weatherService.attachPresenter(this)
        weatherService.getWeather("Томск")
    }

    override fun showToast(str: String) {
        view?.showToast(str)
    }
}