package com.example.mvc_mvp_mvvmdemo.mvvm.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvc_mvp_mvvmdemo.R
import com.example.mvc_mvp_mvvmdemo.mvvm.viewmodel.LoginViewModel


class MvvmLoginActivity : AppCompatActivity() {
    private var userNameET:EditText?=null
    private var passwordET: EditText?=null
    private var loginVM: LoginViewModel?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc_login)

        userNameET=findViewById(R.id.user_name_et)
        passwordET=findViewById(R.id.password_et)
        val loginBtn=findViewById<Button>(R.id.login_btn)
        loginBtn.setOnClickListener {
            loginVM?.login(userNameET?.text.toString(), passwordET?.text.toString())
        }
        loginVM = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        loginVM?.getIsLoginSuccessFulLD()?.observe(this, loginObserver)
    }

    private val loginObserver: Observer<Boolean?> = object : Observer<Boolean?> {
        override fun onChanged(isLoginSuccessFul: Boolean?) {
            if (isLoginSuccessFul == true) {
                Toast.makeText(this@MvvmLoginActivity,
                        loginVM!!.getUserName() + " Login Successful",
                        Toast.LENGTH_SHORT)
                        .show()
            } else {
                Toast.makeText(this@MvvmLoginActivity,
                        "Login Failed",
                        Toast.LENGTH_SHORT)
                        .show()
            }
        }
    }
}