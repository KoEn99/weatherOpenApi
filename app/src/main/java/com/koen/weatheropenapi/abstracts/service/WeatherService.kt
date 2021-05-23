package com.koen.weatheropenapi.abstracts.service

import com.koen.weatheropenapi.abstracts.data.WeatherDao
import com.koen.weatheropenapi.api.WeatherApi
import com.koen.weatheropenapi.di.modules.RetrofitModule
import com.koen.weatheropenapi.ui.activity.MainScreenContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class WeatherService @Inject constructor(): BaseServiceImpl<MainScreenContract.Presenter>(), MainScreenContract.Service {
    @Inject lateinit var weatherApi: WeatherApi
    override fun getWeather(str: String) {
        weatherApi.getWeatherForCity(str, "485b7d7278357e9ce9c2765128f1d66a").enqueue(object : retrofit2.Callback<WeatherDao>{
            override fun onResponse(call: Call<WeatherDao>, response: Response<WeatherDao>) {
               presenter?.showToast(response.body()?.temp.toString())
            }

            override fun onFailure(call: Call<WeatherDao>, t: Throwable) {
                presenter?.showToast(t.message.toString())
            }

        })

    }

}