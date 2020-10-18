package com.example.Code_Cpp

import android.os.Bundle
import android.widget.ScrollView
import kotlinx.android.synthetic.main.activity_advancecpp_activity.*

class advancecpp_activity : toextend() {

    var i:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advancecpp_activity)

        webadvancedview.loadUrl(urlsAdvancecpp[i])
//        webadvancedview.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(
//                view: WebView?,
//                request: WebResourceRequest?
//            ): Boolean {
//                return false
//            }
//        }

        advancenextbtn.setOnClickListener {

            if(i+1<urlsAdvancecpp.size)
            {
                i=i+1
                webadvancedview.loadUrl(urlsAdvancecpp[i])
                advancescrollview.fullScroll(ScrollView.FOCUS_UP)

            }
        }

        advancebackbtn.setOnClickListener {

            if(i!=0)
            {
                i=i-1
                webadvancedview.loadUrl(urlsAdvancecpp[i])
                advancescrollview.fullScroll(ScrollView.FOCUS_UP)
                // scrollwebview.smoothScrollTo(0,0)
            }
        }
    }
}
