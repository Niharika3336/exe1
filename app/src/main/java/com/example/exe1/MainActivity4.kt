package com.example.exe1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var spin = findViewById<Spinner>(R.id.chc)
        var click1 = findViewById<Button>(R.id.click)
        var nf  = findViewById<EditText>(R.id.n1)
        var nl = findViewById<EditText>(R.id.n2)
        var res1 =  findViewById<TextView>(R.id.res)
        click1.setOnClickListener(View.OnClickListener {
            var op = spin.selectedItem.toString()
            var a = nf.text.toString().toInt()
            var b  = nl.text.toString().toInt()
            when (op){
                "+"->  res1.setText("result: "+add(a,b))
                "-"->  res1.setText("result: "+sub(a,b))
                "*"->  res1.setText("result: "+mul(a,b))
                "/"->  res1.setText("result: "+div(a,b))
            }

        })
    }
}
fun add(a:Int,b:Int):Int
{
    return a + b
}
fun sub(a:Int,b:Int):Int
{
    return a - b.toInt()
}
fun mul(a:Int,b:Int):Int
{
    return a * b.toInt()
}
fun div(a:Int,b:Int):Int
{
    return a / b.toInt()
}




