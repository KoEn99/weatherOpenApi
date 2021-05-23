package com.koen.weatheropenapi.ui.activity

import com.koen.weatheropenapi.abstracts.presenter.BaseMvpPresenter
import com.koen.weatheropenapi.abstracts.service.BaseService
import com.koen.weatheropenapi.abstracts.view.BaseView

interface MainScreenContract {
    interface Presenter: BaseMvpPresenter<View>
    {
        fun generateText(str:String)
        fun showToast(str: String)
    }
    interface View: BaseView
    {
        fun showToast(str:String)
    }
    interface Service:BaseService<Presenter>
    {
        fun getWeather(str: String)
    }
}