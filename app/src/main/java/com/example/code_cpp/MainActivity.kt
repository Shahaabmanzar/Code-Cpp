package com.example.code_cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var flag=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        Handler().postDelayed(
            {
                val int= Intent(this,main_menu::class.java)
                flag=flag+1
                startActivity(int)

            },2000
        )
    }


    override fun onResume() {
        super.onResume()

        flag=flag+1
        if(flag>2) {
            exitProcess(-1)
        }
    /*
        Handler().postDelayed(
            {
                val int= Intent(this,main_menu::class.java)
                startActivity(int)
            },2000
        )

     */

    }

}

