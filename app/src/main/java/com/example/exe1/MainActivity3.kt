package com.example.exe1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var inp = findViewById<EditText>(R.id.enter)
        var btn2 = findViewById<Button>(R.id.btn1)
        var txt = findViewById<TextView>(R.id.txtv)
        btn2.setOnClickListener(View.OnClickListener {
            var n :Int =inp.text.toString().toInt()
            var s=""
            var i=1
            while(true)
            {
                s += "$i@"
                if(i>n){
                    break;
                }
                ++i;
                txt.setText("$s")
            }

        })
    }
}