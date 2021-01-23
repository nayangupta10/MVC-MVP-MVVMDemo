package com.example.mvc_mvp_mvvmdemo.mvp.model

import com.example.mvc_mvp_mvvmdemo.mvp.presenter.LoginPresenter

public class UserBiz() : IUserBiz {
    override fun login(userName: String?, password: String?): Boolean {
        if (userName.toString().equals("nayan") && password.toString().equals("123")) {
            var user = User()
            user.setUserName(userName)
            user.setPassword(password)
            return true
        }
        return false
    }
}