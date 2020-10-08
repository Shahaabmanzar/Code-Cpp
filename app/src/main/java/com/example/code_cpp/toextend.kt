package com.example.code_cpp

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class toextend:AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

        if(item.itemId==R.id.main_menu_icon)
        {
            val intent=Intent(this,main_menu::class.java)
            startActivity(intent)

        }
        else
        {
            this.finishAffinity()
        }

        return true
    }
}