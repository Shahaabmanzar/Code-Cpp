package com.example.Code_Cpp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_editor.*
import java.lang.Error
import java.lang.Exception

class Editor : toextend() {
    val db= Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        try {
            db.collection("Onlineusers").add(forurl("advance", urlsAdvancecpp))
        }
        catch (e: Exception)
        {
            Toast.makeText(this,e.message,Toast.LENGTH_SHORT).show()
        }
        val sharedevent=getSharedPreferences("ide",0)

        var text=sharedevent.getString("idestring","//write code here").toString()
        ide_text.setText(text)
        run_btn.setOnClickListener{
            Toast.makeText(this,"Coming soon!! File saved for now ",Toast.LENGTH_SHORT).show()

            val editor=sharedevent.edit()
            editor.putString("idestring",ide_text.text.toString())
            editor.apply()
            editor.commit()
        }



    }
}
