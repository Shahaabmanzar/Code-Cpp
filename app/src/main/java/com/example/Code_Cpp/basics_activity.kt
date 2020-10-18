package com.example.Code_Cpp

import android.os.Bundle
import android.widget.ScrollView
import kotlinx.android.synthetic.main.activity_basics_activity.*

class basics_activity : toextend() {

    var i:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics_activity)

        basicwebview.loadUrl(urlsbasics[i])

        webnextbtn.setOnClickListener {
            if(i+1<urlsbasics.size)
            {
                i=i+1
                basicwebview.loadUrl(urlsbasics[i])
                scrollwebview.fullScroll(ScrollView.FOCUS_UP)

            }
        }

        webbackbtn.setOnClickListener {

            if(i!=0)
            {
                i=i-1
                basicwebview.loadUrl(urlsbasics[i])
                scrollwebview.fullScroll(ScrollView.FOCUS_UP)
               // scrollwebview.smoothScrollTo(0,0)
            }
        }
    }
}
