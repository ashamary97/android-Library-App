package com.newapp.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun backtologin(view: View) {

        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
    fun registerbtnclick(view: View) {
        var getname=findViewById<EditText>(R.id.name);
        var getemail=findViewById<EditText>(R.id.email);
        var getmobile=findViewById<EditText>(R.id.mobile);
        var getuname=findViewById<EditText>(R.id.uname);
        var getpass=findViewById<EditText>(R.id.pass);

        Toast.makeText(this,getname.text.toString()+""+getemail.text.toString()+""+getmobile.text.toString()+""+getuname.text.toString()+""+getpass.text.toString(),Toast.LENGTH_LONG).show();

        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);

    }
}