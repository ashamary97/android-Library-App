package com.newapp.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenubarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menubar)
    }

    fun addbtnclick(view: View) {

        intent=Intent(this,AddbookActivity::class.java);
        startActivity(intent);
    }
    fun searchbtnclick(view: View) {
        intent=Intent(this,SearchActivity::class.java);
        startActivity(intent);
    }

    fun backtologin(view: View) {
        intent=Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}