package com.example.Code_Cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var flag=0
//    val db= Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val topanim=AnimationUtils.loadAnimation(this,R.anim.fromup)
        val bottomanim=AnimationUtils.loadAnimation(this,R.anim.fromdown)

        cpp_logo.startAnimation(topanim)
        Code_cpp_text.startAnimation(bottomanim)

        getdbchanged()
        //Toast.makeText(this,data,Toast.LENGTH_SHORT).show()
        aboutme=getString(R.string.aboutstring)

//        if(isdbchanged==true)
//        {
//            initialdbwrite()
//        }
/*
        try {
            db.collection("Onlineusers").add(forurl("advance", urlsAdvancecpp))
        }
        catch (e: Exception)
        {
            Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
        }
*/

        supportActionBar?.hide()
        Handler().postDelayed(
            {
                val int= Intent(this,loginactivity::class.java)
                flag=flag+1
                startActivity(int)
                finish()
            },2500
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

