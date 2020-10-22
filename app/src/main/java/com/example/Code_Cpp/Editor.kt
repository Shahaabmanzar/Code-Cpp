package com.example.Code_Cpp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_editor.*
import java.lang.Error
import java.lang.Exception

class Editor : toextend() {
    val db= Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        val sharedevent=getSharedPreferences("ide",0)
        var text=sharedevent.getString("idestring","//write code here").toString()
        ide_text.setText(text)


        val ref=db.collection("Onlineusers").document("Oopsurl")
        ref.get().addOnSuccessListener {
                val newurls = it.toObject<forurl>()
                val urls = newurls?.theurls
                Toast.makeText(this, urls?.get(0),Toast.LENGTH_SHORT).show()
        }


        run_btn.setOnClickListener{
            Toast.makeText(this,"Coming soon!! File saved for now ",Toast.LENGTH_SHORT).show()

            val editor=sharedevent.edit()
            editor.putString("idestring",ide_text.text.toString())
            editor.apply()
            editor.commit()
        }



    }
}
