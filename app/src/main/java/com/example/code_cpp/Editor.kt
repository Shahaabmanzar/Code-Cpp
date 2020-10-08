package com.example.code_cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_editor.*

class Editor : toextend() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        val sharedevent=getSharedPreferences("ide",0)

        var text=sharedevent.getString("idestring","//write code here").toString()
        ide_text.setText(text)
        run_btn.setOnClickListener{
            Toast.makeText(this,"You click float btn",Toast.LENGTH_SHORT).show()

            val editor=sharedevent.edit()
            editor.putString("idestring",ide_text.text.toString())
            editor.apply()
            editor.commit()
        }



    }
}
