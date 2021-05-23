package com.koen.weatheropenapi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.koen.weatheropenapi.App
import com.koen.weatheropenapi.R
import com.koen.weatheropenapi.abstracts.service.WeatherService
import com.koen.weatheropenapi.abstracts.view.BaseCompatActivity
import javax.inject.Inject

class MainActivity : BaseCompatActivity(),
    MainScreenContract.View
{
    @Inject lateinit var presenter: MainScreenPresenter
    override fun init(savedInstanceState: Bundle?) {
        App.get().injector.inject(this)
        App.get().injector.inject(WeatherService())
        setContentView(R.layout.activity_main)
        presenter.attach(this)
        presenter.generateText("TEXT SUKA")

    }

    override fun showToast(str: String) {
        Toast.makeText(getContext(), str, Toast.LENGTH_LONG).show()
    }
}