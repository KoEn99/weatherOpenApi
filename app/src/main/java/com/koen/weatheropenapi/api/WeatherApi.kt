package com.koen.weatheropenapi.api

import com.koen.weatheropenapi.abstracts.data.WeatherDao
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*

interface WeatherApi {
    @GET("/data/2.5/weather")
    fun getWeatherForCity(@Query("q") city: String, @Query("APPID") apiKey: String): Observable<WeatherDao>
}