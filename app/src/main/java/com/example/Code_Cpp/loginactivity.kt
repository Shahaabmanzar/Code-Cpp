package com.example.Code_Cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_loginactivity.*

class loginactivity : AppCompatActivity() {
    private lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)
        supportActionBar?.hide()

        auth=Firebase.auth
        login_btn.setOnClickListener {
            login()
        }

        signupbtn.setOnClickListener {
            val intent=Intent(this,signupactivity::class.java)
            startActivity(intent)
        }
    }

    fun login()
    {

        if(emailtxt.text.toString().isEmpty())
        {
            Toast.makeText(this,"Enter Email",Toast.LENGTH_SHORT).show()
            return
        }
        if(passtext.text.toString().isEmpty())
        {
            Toast.makeText(this,"Enter Password",Toast.LENGTH_SHORT).show()
            return
        }

        auth.signInWithEmailAndPassword(emailtxt.text.toString(), passtext.text.toString())
    .addOnCompleteListener(this) { task ->
        if (task.isSuccessful) {
            val intent = Intent(this, main_menu::class.java)
            val user=Firebase.auth.currentUser
            Toast.makeText(this,"Welcome ${user?.displayName}",Toast.LENGTH_LONG).show()
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show()
        }

    }
}


}
