package com.example.mvc_mvp_mvvmdemo.mvp.presenter

import com.example.mvc_mvp_mvvmdemo.mvp.model.UserBiz
import com.example.mvc_mvp_mvvmdemo.mvp.view.IMvpLoginView


 class LoginPresenter(iMvpLoginView: IMvpLoginView?) {
    private var userBiz: UserBiz? = UserBiz()
    private var iMvpLoginView: IMvpLoginView? = iMvpLoginView

    fun login(){
        var userName:String?= iMvpLoginView?.getUserName()
        var password:String?=iMvpLoginView?.getPassword()
        val isLoginSuccessful = userBiz!!.login(userName, password)
        iMvpLoginView?.onLoginResult(isLoginSuccessful)
    }
}