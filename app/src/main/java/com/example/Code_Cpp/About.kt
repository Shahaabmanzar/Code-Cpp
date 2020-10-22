package com.example.Code_Cpp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class About : toextend(){

    val linkedinurl="https://www.linkedin.com/in/mohammad-atif-514b82189/"
    val githuburl="https://github.com/Mohammad-Atif"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        aboutme_txt.setText(aboutme)



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
