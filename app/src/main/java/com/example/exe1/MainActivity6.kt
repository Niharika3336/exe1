package com.example.exe1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        var name=findViewById<EditText>(R.id.nameinp)
        var gender=findViewById<EditText>(R.id.geninp)
        var age=findViewById<EditText>(R.id.ageinp)
        var btnn=findViewById<Button>(R.id.clc)
        btnn.setOnClickListener(View.OnClickListener {
            val per = person()
            per.name = name.text.toString()
            per.gender = gender.text.toString()
            per.age = age.text.toString().toInt()
            var result = " ${per.name}"
            Toast.makeText(this, result, Toast.LENGTH_LONG).show()
        })
    }
}