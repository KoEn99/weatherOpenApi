package com.koen.weatheropenapi.abstracts.service

import com.koen.weatheropenapi.abstracts.presenter.BaseMvpPresenter
import com.koen.weatheropenapi.abstracts.view.BaseView

interface BaseService<P: BaseMvpPresenter<*>> {
    fun attachPresenter(presenter:P)
}