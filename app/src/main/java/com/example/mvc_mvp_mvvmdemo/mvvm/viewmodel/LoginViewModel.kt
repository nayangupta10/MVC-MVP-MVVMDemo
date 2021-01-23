package com.example.mvc_mvp_mvvmdemo.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvc_mvp_mvvmdemo.mvvm.model.User


class LoginViewModel : ViewModel() {
    private var user:User?= User()
    private val isLoginSuccessfulLD: MutableLiveData<Boolean>? =MutableLiveData()

    fun getIsLoginSuccessFulLD(): MutableLiveData<Boolean>? {
        return isLoginSuccessfulLD
    }

    fun setIsLoginSuccessfulLD(isLoginSuccessful :Boolean?){
        isLoginSuccessfulLD?.postValue(isLoginSuccessful)
    }

    fun login(userName:String?,password: String?){
        if(userName.equals("nayan") && password.equals("123")){
            user?.setUserName(userName)
            user?.setPassword(password)
            setIsLoginSuccessfulLD(true)
        }else{
            setIsLoginSuccessfulLD(false)
        }
    }

    fun getUserName(): String?{
        return user?.getUserName()
    }
}