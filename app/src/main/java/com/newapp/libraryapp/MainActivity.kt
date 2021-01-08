package com.newapp.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerbtnclick(view: View) {

        intent=Intent(this,RegisterActivity::class.java);
        startActivity(intent);
    }

    fun loginbtnclick(view: View) {
        var getname=findViewById<EditText>(R.id.uname);
        var getpass=findViewById<EditText>(R.id.pass);
        var u=getname.text.toString();
        var p=getpass.text.toString();
        if(u.equals("admin") and p.equals("1234")){
            Toast.makeText(this,"Invalid Username and Password", Toast.LENGTH_LONG).show();
        }
        else{
            intent=Intent(this,MenubarActivity::class.java);
            startActivity(intent);
        }

    }
}