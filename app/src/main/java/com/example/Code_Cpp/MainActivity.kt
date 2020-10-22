package com.example.Code_Cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.lang.Exception
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var flag=0
//    val db= Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getdbchanged()
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

