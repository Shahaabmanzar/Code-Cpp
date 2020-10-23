package com.example.Code_Cpp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_helpactivity.*

class helpactivity : AppCompatActivity() {
    var text_to_send=""
    val emails= arrayOf("mohammadatif92080@gmail.com")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helpactivity)

        sendques_btn.setOnClickListener {
            text_to_send=tosend_text.text.toString()
            if(text_to_send!="" && text_to_send!="Write here")
            {
                val intent=Intent(Intent.ACTION_SEND)

                intent.putExtra(Intent.EXTRA_EMAIL,emails)
                intent.putExtra(Intent.EXTRA_SUBJECT,"Cpp Question")
                intent.putExtra(Intent.EXTRA_TEXT,text_to_send)
                intent.type="messege/rfc822"
                startActivity(Intent.createChooser(intent,"Select email App:"))
            }
            else
            {
                Toast.makeText(this,"Write Question First",Toast.LENGTH_SHORT).show()
            }
        }

    }

}
