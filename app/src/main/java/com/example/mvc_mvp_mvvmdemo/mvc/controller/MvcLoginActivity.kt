package com.example.mvc_mvp_mvvmdemo.mvc.controller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mvc_mvp_mvvmdemo.R
import com.example.mvc_mvp_mvvmdemo.mvc.Model.User


class MvcLoginActivity : AppCompatActivity() {
    private var user: User? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc_login)

        user = User()
        val userNameET =findViewById<EditText>(R.id.user_name_et);
        val passwordET =findViewById<EditText>(R.id.password_et);
        val loginBtn =findViewById<Button>(R.id.login_btn);
        loginBtn.setOnClickListener {
            login(userNameET.text.toString(), passwordET.text.toString())
        }
    }

    private fun login(userName: String, password: String) {
        if(userName.equals("nayan") && password.equals("123")){
          user?.userName
            user?.password
            Toast.makeText(this, userName + "Login Successful", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(this, "Login failed", Toast.LENGTH_LONG).show()


    }
}