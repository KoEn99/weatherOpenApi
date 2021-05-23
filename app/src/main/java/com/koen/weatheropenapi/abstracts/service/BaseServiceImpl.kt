package com.koen.weatheropenapi.abstracts.service

import com.koen.weatheropenapi.abstracts.presenter.BaseMvpPresenter
import com.koen.weatheropenapi.abstracts.view.BaseView

open class BaseServiceImpl<P:BaseMvpPresenter<*>>: BaseService<P>{
    protected var presenter: P? = null
        private set
    override fun attachPresenter(presenter: P) {
        this.presenter = presenter
    }

}