package com.newapp.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class AddbookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addbook)
    }

    fun addbtnclick(view: View) {
        var getname=findViewById<EditText>(R.id.name);
        var getauthor=findViewById<EditText>(R.id.author);
        var getpublisher=findViewById<EditText>(R.id.publisher);
        var getyear=findViewById<EditText>(R.id.year);
        var getprice=findViewById<EditText>(R.id.price);

        Toast.makeText(this,getname.text.toString()+" "+getauthor.text.toString()+"  "+getpublisher.text.toString()+"  "+getyear.text.toString()+"  "+getprice.text.toString()+"  "+"Item added",
            Toast.LENGTH_LONG).show();


    }
    fun backtomenu(view: View) {

        intent= Intent(this,MenubarActivity::class.java);
        startActivity(intent);
    }
}