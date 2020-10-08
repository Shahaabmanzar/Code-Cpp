package com.example.code_cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_envr_setup.*
import android.os.Handler
import android.webkit.WebViewClient

class envr_setup : toextend() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_envr_setup)


        web_envr.webViewClient= WebViewClient()

        web_envr.loadUrl("https://www.tutorialspoint.com/cplusplus/cpp_environment_setup.htm")


        Handler().postDelayed(
            {
                Toast.makeText(this, "Tutorials Point Website", Toast.LENGTH_SHORT).show()
            },2000
        )









    }


}

