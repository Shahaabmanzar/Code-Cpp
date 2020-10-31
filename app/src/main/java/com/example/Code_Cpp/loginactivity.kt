package com.example.Code_Cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginactivity.*

class loginactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)
        supportActionBar?.hide()


        login_btn.setOnClickListener {
            val intent=Intent(this,main_menu::class.java)
            startActivity(intent)
        }

        signupbtn.setOnClickListener {
            val intent=Intent(this,signupactivity::class.java)
            startActivity(intent)
        }
    }
}
