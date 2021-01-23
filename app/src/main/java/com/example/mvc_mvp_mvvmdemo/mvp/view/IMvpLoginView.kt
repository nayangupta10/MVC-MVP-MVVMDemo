package com.example.mvc_mvp_mvvmdemo.mvp.view

interface IMvpLoginView {
    fun getUserName() :String?
    fun getPassword() : String?

    fun onLoginResult(isLoginSuccess: Boolean?)

}