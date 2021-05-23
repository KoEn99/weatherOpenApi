package com.koen.weatheropenapi.abstracts.service

import com.koen.weatheropenapi.abstracts.data.WeatherDao
import com.koen.weatheropenapi.api.WeatherApi
import com.koen.weatheropenapi.di.modules.RetrofitModule
import com.koen.weatheropenapi.ui.activity.MainScreenContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class WeatherService @Inject constructor(): BaseServiceImpl<MainScreenContract.Presenter>(), MainScreenContract.Service {
    @Inject lateinit var weatherApi: WeatherApi

    override fun getWeather(str: String) {
        weatherApi.getWeatherForCity(str, "485b7d7278357e9ce9c2765128f1d66a")
            .subscribeOn(Schedulers.io())
          //  .delay(10, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                presenter?.showToast(it?.temp.toString() + " " + it?.name.toString())
            },{

            })


    }

}