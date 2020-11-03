package com.example.Code_Cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.ktx.userProfileChangeRequest
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_signupactivity.*

class signupactivity : AppCompatActivity() {
    lateinit var desig:String
    private lateinit var auth:FirebaseAuth
    private val flag=0
    var pos=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)

    spdesgination.onItemSelectedListener=object: AdapterView.OnItemSelectedListener{
        override fun onNothingSelected(p0: AdapterView<*>?) {

        }

        override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {

            desig=adapterView?.getItemAtPosition(position).toString()
            pos=position
        }
    }

        auth=Firebase.auth

        sign_btn.setOnClickListener {
            signupuser()
        }

    }

    fun signupuser()
    {
        if(sup_nametxt.text.toString().isEmpty())
        {
            Toast.makeText(this,"Please Enter Name",Toast.LENGTH_SHORT).show()
            sup_nametxt.requestFocus()
            return
        }

        if(pos==0)
        {
            Toast.makeText(this,"Please Select Designation",Toast.LENGTH_SHORT).show()
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(emailsignuptxt.text.toString()).matches())
        {
            Toast.makeText(this,"Please Enter Valid Email",Toast.LENGTH_SHORT).show()
            emailsignuptxt.requestFocus()
            return
        }

        if(passsignuptext.text.toString().isEmpty())
        {
            Toast.makeText(this,"Please Enter Password",Toast.LENGTH_SHORT).show()
            passsignuptext.requestFocus()
            return
        }

        if(passsignuptext.text.toString().length<5)
        {
            Toast.makeText(this,"Too Short Password",Toast.LENGTH_SHORT).show()
            passsignuptext.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(emailsignuptxt.text.toString(),passsignuptext.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    val user = auth.currentUser

                    val profileUpdates = userProfileChangeRequest {
                        displayName =sup_nametxt.text.toString()
                    }
                    if (user != null) {
                        user.updateProfile(profileUpdates)
                    }
                   Toast.makeText(this,"Signed Up succesfully",Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,loginactivity::class.java))

                } else {
                    Toast.makeText(this,"Signed Up Failed",Toast.LENGTH_SHORT).show()
                }

                // ...
            }

    }

}
