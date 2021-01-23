package com.example.mvc_mvp_mvvmdemo.mvp.model

public interface IUserBiz {

    fun login(userName: String?, password: String?): Boolean
}