package com.example.Code_Cpp

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import java.lang.Exception



var isdbchanged:Boolean?=true
fun getdbchanged()
{
    val db=Firebase.firestore
    val ref=db.collection("Onlineusers").document("dbcondition")
    ref.get().addOnSuccessListener {
        val con=it.toObject<status>()
        isdbchanged=con?.isdbchanged
        if(con?.isdbchanged==true)
        {
            getnewurls()
        }
    }

}


fun writetodb(p:forurl,name:String)
{
    val db=Firebase.firestore
    val ref=db.collection("Onlineusers")
    ref.document(name).set(p)

}

fun initialdbwrite()
{
    val db=Firebase.firestore

    try {
        val ref = db.collection("Onlineusers")
        ref.document("Advanceurl").set(forurl("advancecppurl", urlsAdvancecpp))
        ref.document("Basicsurl").set(forurl("basicsurls", urlsbasics))
        ref.document("Oopsurl").set(forurl("oopsurls", urlsoops))
        ref.document("AboutActivity").set(aboutsection(aboutme))
        ref.document("dbcondition").set(status(false))
    }
    catch (e:Exception)
    {
        Log.d("inwriting",e.message.toString())
    }

}


fun getnewurls()
{
    Log.d("forcheck","I get called")
    val db=Firebase.firestore
    val ref=db.collection("Onlineusers")
    ref.get().addOnSuccessListener {
        for(document in it.documents)
        {
            when(document.id)
            {
                "AboutActivity"-> {
                        val n=document.toObject<aboutsection>()
                        aboutme=n?.aboutme
                }
                "Advanceurl"->{
                    val n=document.toObject<forurl>()
                    urlsAdvancecpp=n?.theurls!!
                    //urlsAdvancecpp= n?.theurls!!
                }
                "Oopsurl"->{
                    val n=document.toObject<forurl>()
                    urlsoops=n?.theurls!!
                    //urlsoops.addAll(n?.theurls!!)
                }

            }
        }
    }
    //ref.document("dbcondition").set(status(false))
//    initialdbwrite()
}
