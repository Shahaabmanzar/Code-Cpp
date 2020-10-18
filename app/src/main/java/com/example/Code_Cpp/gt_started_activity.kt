package com.example.Code_Cpp

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gt_started_activity.*

class gt_started_activity : toextend() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gt_started_activity)

        whycpp_btn.setOnClickListener {

            val intent=Intent(this,whycpp::class.java)
            startActivity(intent)
        }

        envr_btn.setOnClickListener {
            val intent=Intent(this,envr_setup::class.java)
            startActivity(intent)
        }


    }


}
