package com.example.code_cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main_menu.*

class main_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        getting_started_btn.setOnClickListener {
            val intent=Intent(this,gt_started_activity::class.java)
            startActivity(intent)
        }

    }
    }

