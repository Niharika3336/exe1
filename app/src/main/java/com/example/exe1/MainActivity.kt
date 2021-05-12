package com.example.exe1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inp= findViewById<EditText>(R.id.inp)
        var btn= findViewById<Button>(R.id.btn)
        var txt1= findViewById<TextView>(R.id.txt)
        btn.setOnClickListener(View.OnClickListener {
            var radius:Double =inp.text.toString().toDouble()
            val pi:Double = 3.141
            var area = pi*radius*radius
            txt1.setText("Result : $area")
        }
        )
    }
}