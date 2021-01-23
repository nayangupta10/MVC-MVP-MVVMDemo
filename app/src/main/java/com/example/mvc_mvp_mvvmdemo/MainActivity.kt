package com.example.mvc_mvp_mvvmdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mvc_mvp_mvvmdemo.mvc.controller.MvcLoginActivity
import com.example.mvc_mvp_mvvmdemo.mvp.view.MvpLoginActivity
import com.example.mvc_mvp_mvvmdemo.mvvm.view.MvvmLoginActivity

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mvcBtn=findViewById<Button>(R.id.mvc_btn);
        mvcBtn.setOnClickListener(this)
        val mvpBtn=findViewById<Button>(R.id.mvp_btn)
        mvpBtn.setOnClickListener(this)
        val mvvmBtn=findViewById<Button>(R.id.mvvm_btn)
        mvvmBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.mvc_btn ->{
                val intent= Intent(this@MainActivity, MvcLoginActivity::class.java)
                startActivity(intent)
            }
            R.id.mvp_btn->{
                val intent=Intent(this,MvpLoginActivity::class.java)
                startActivity(intent)
            }
            R.id.mvvm_btn->{
                val intent=Intent(this,MvvmLoginActivity::class.java)
                startActivity(intent)
            }
        }

    }

}