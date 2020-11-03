package com.example.Code_Cpp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main_menu.*

class main_menu : toextend() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        flagforwelcome= flagforwelcome+1

//        if(flagforwelcome==1)
//        {
//            val user=Firebase.auth.currentUser
//            Toast.makeText(this,"Welcome ${user?.displayName.toString()}",Toast.LENGTH_SHORT).show()
//        }
        getting_started_btn.setOnClickListener {
            val intent=Intent(this,gt_started_activity::class.java)
            startActivity(intent)
        }



        ide_btn.setOnClickListener {

            val intent=Intent(this,Editor::class.java)
            startActivity(intent)
        }

        core_topics_btn.setOnClickListener {

            val intent=Intent(this,coretopics_activity::class.java)
            startActivity(intent)
        }

        advance_topics_btn.setOnClickListener {

            val intent=Intent(this,advancecpp_activity::class.java)
            startActivity(intent)
        }

        comp_coding_btn.setOnClickListener {

            Toast.makeText(this,"Coming soon",Toast.LENGTH_SHORT).show()
        }

        resources_used_btn.setOnClickListener {

            Toast.makeText(this,"Coming soon",Toast.LENGTH_SHORT).show()
        }

        helpbtn.setOnClickListener {
            val intent=Intent(this,helpactivity::class.java)
            startActivity(intent)
        }

    }


}

