package com.example.code_cpp

import android.os.Bundle
import android.widget.ScrollView
import kotlinx.android.synthetic.main.activity_oops_activity.*

class oops_activity :toextend() {

    var i:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oops_activity)
        oopswebview.loadUrl(urlsoops[0])

        weboopsnextbtn.setOnClickListener {
            if(i+1<urlsoops.size)
            {
                i=i+1
                oopswebview.loadUrl(urlsoops[i])
                scrolloopswebview.fullScroll(ScrollView.FOCUS_UP)

            }
        }

        weboopsbackbtn.setOnClickListener {

            if(i!=0)
            {
                i=i-1
                oopswebview.loadUrl(urlsoops[i])
                scrolloopswebview.fullScroll(ScrollView.FOCUS_UP)
                // scrollwebview.smoothScrollTo(0,0)
            }
        }
    }
}
