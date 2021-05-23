package com.koen.weatheropenapi.abstracts.presenter

import com.koen.weatheropenapi.abstracts.view.BaseView

interface BaseMvpPresenter<V: BaseView> {
    fun attach(view: V)
    fun detach()
}