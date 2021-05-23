package com.koen.weatheropenapi.abstracts.presenter

import com.koen.weatheropenapi.abstracts.view.BaseView

open class BasePresenter<V : BaseView> : BaseMvpPresenter<V> {
    protected var view: V? = null
        private set

    override fun attach(view: V) {
        this.view = view
    }

    override fun detach() {
        this.view = null
    }
}