package com.example.code_cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_coretopics_activity.*

class coretopics_activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coretopics_activity)

        basics_btn.setOnClickListener {

            val intent= Intent(this,basics_activity::class.java)
            startActivity(intent)
        }

        oops_btn.setOnClickListener {

            val intent=Intent(this,oops_activity::class.java)
            startActivity(intent)
        }

    }
}
