package com.example.code_cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_editor.*

class Editor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        run_btn.setOnClickListener{
            Toast.makeText(this,"You click float btn",Toast.LENGTH_SHORT).show()
        }

    }
}
