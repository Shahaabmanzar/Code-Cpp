package com.example.code_cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import kotlinx.android.synthetic.main.activity_basics_activity.*
import kotlinx.android.synthetic.main.activity_oops_activity.*

class oops_activity : AppCompatActivity() {

    val urls= arrayListOf<String>("https://www.tutorialspoint.com/cplusplus/cpp_classes_objects.htm","https://www.tutorialspoint.com/cplusplus/cpp_inheritance.htm","https://www.tutorialspoint.com/cplusplus/cpp_overloading.htm","https://www.tutorialspoint.com/cplusplus/cpp_polymorphism.htm","https://www.tutorialspoint.com/cplusplus/cpp_data_abstraction.htm","https://www.tutorialspoint.com/cplusplus/cpp_data_encapsulation.htm","https://www.tutorialspoint.com/cplusplus/cpp_interfaces.htm")
    var i:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oops_activity)
        oopswebview.loadUrl(urls[0])

        weboopsnextbtn.setOnClickListener {
            if(i+1<urls.size)
            {
                i=i+1
                oopswebview.loadUrl(urls[i])
                scrolloopswebview.fullScroll(ScrollView.FOCUS_UP)

            }
        }

        weboopsbackbtn.setOnClickListener {

            if(i!=0)
            {
                i=i-1
                oopswebview.loadUrl(urls[i])
                scrolloopswebview.fullScroll(ScrollView.FOCUS_UP)
                // scrollwebview.smoothScrollTo(0,0)
            }
        }
    }
}
