package com.example.Code_Cpp

import android.content.Context
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import java.lang.Exception



var isdbchanged:Boolean=true
fun getdbchanged()
{
    val db=Firebase.firestore
    val ref=db.collection("Onlineusers").document("dbcondition")
    val change:status?=ref.get().result!!.toObject<status>()
    isdbchanged=change?.isdbchanged!!
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

        ref.document("dbcondition").set(status(false))
    }
    catch (e:Exception)
    {
        isdbchanged=true
    }

}