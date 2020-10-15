package com.example.code_cpp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about.*

class About : toextend(){

    val linkedinurl="https://www.linkedin.com/in/mohammad-atif-514b82189/"
    val githuburl="https://github.com/Mohammad-Atif"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        linkedinlogo.setOnClickListener{

            val intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(linkedinurl))
            startActivity(intent)

        }

        gitlogo.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(githuburl))
            startActivity(intent)
        }
    }
}
