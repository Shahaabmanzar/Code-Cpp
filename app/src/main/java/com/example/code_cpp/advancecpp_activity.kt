package com.example.code_cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ScrollView
import kotlinx.android.synthetic.main.activity_advancecpp_activity.*
import kotlinx.android.synthetic.main.activity_oops_activity.*

class advancecpp_activity : toextend() {

    val urls= arrayListOf<String>("https://www.tutorialspoint.com/cplusplus/cpp_files_streams.htm","https://www.tutorialspoint.com/cplusplus/cpp_exceptions_handling.htm","https://www.tutorialspoint.com/cplusplus/cpp_dynamic_memory.htm","https://www.tutorialspoint.com/cplusplus/cpp_namespaces.htm","https://www.tutorialspoint.com/cplusplus/cpp_templates.htm","https://www.tutorialspoint.com/cplusplus/cpp_preprocessor.htm","https://www.tutorialspoint.com/cplusplus/cpp_signal_handling.htm","https://www.tutorialspoint.com/cplusplus/cpp_multithreading.htm","https://www.tutorialspoint.com/cplusplus/cpp_web_programming.htm")
    var i:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advancecpp_activity)

        webadvancedview.loadUrl(urls[i])
//        webadvancedview.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(
//                view: WebView?,
//                request: WebResourceRequest?
//            ): Boolean {
//                return false
//            }
//        }

        advancenextbtn.setOnClickListener {

            if(i+1<urls.size)
            {
                i=i+1
                webadvancedview.loadUrl(urls[i])
                advancescrollview.fullScroll(ScrollView.FOCUS_UP)

            }
        }

        advancebackbtn.setOnClickListener {

            if(i!=0)
            {
                i=i-1
                webadvancedview.loadUrl(urls[i])
                advancescrollview.fullScroll(ScrollView.FOCUS_UP)
                // scrollwebview.smoothScrollTo(0,0)
            }
        }
    }
}
