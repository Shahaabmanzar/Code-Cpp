package com.example.code_cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_envr_setup.*

class envr_setup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_envr_setup)

        web_envr.loadUrl("https://www.tutorialspoint.com/cplusplus/cpp_environment_setup.htm")
    }
}
