package com.example.mvc_mvp_mvvmdemo.mvp.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mvc_mvp_mvvmdemo.R
import com.example.mvc_mvp_mvvmdemo.mvp.presenter.LoginPresenter


class MvpLoginActivity : AppCompatActivity() ,IMvpLoginView {
    private var userNameEt: EditText? = null
    private var passwordEt: EditText? = null
    private var loginPresenter:LoginPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp_login)

        loginPresenter= LoginPresenter(this)
        userNameEt=findViewById(R.id.user_name_et)
        passwordEt=findViewById(R.id.password_et)
        val loginBtn=findViewById<Button>(R.id.login_btn)
        loginBtn.setOnClickListener {
            loginPresenter!!.login()
        }
    }
    override fun getUserName(): String? {
        return userNameEt?.text.toString()
    }

    override fun getPassword(): String? {
        return passwordEt?.text.toString();
    }

    override fun onLoginResult(isLoginSuccess: Boolean?) {
        if (isLoginSuccess==true) {
            Toast.makeText(this, getUserName() + " Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}