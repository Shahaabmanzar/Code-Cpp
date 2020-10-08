package com.example.code_cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basics_activity.*

class basics_activity : AppCompatActivity() {

    val urls= arrayListOf<String>("https://www.tutorialspoint.com/cplusplus/cpp_basic_syntax.htm","https://www.tutorialspoint.com/cplusplus/cpp_comments.htm","https://www.tutorialspoint.com/cplusplus/cpp_data_types.htm","https://www.tutorialspoint.com/cplusplus/cpp_variable_types.htm","https://www.tutorialspoint.com/cplusplus/cpp_constants_literals.htm","https://www.tutorialspoint.com/cplusplus/cpp_operators.htm","https://www.tutorialspoint.com/cplusplus/cpp_loop_types.htm","https://www.tutorialspoint.com/cplusplus/cpp_decision_making.htm","https://www.tutorialspoint.com/cplusplus/cpp_functions.htm","https://www.tutorialspoint.com/cplusplus/cpp_numbers.htm","https://www.tutorialspoint.com/cplusplus/cpp_arrays.htm","https://www.tutorialspoint.com/cplusplus/cpp_strings.htm","https://www.tutorialspoint.com/cplusplus/cpp_pointers.htm")
    var i:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics_activity)

        basicwebview.loadUrl(urls[i])

        webnextbtn.setOnClickListener {
            if(i+1<urls.size)
            {
                i=i+1
                basicwebview.loadUrl(urls[i])

            }
        }

        webbackbtn.setOnClickListener {

            if(i!=0)
            {
                i=i-1
                basicwebview.loadUrl(urls[i])
            }
        }
    }
}
