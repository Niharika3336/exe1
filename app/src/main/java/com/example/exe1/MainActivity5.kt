package com.example.exe1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*;
class MainActivity5 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var clck1 = findViewById<Button>(R.id.clck)
        var temp1  = findViewById<EditText>(R.id.temp)
        var level1 = findViewById<EditText>(R.id.level)
        var view1 =  findViewById<TextView>(R.id.view)
        var food1 =  findViewById<TextView>(R.id.food)
        var chng1 =  findViewById<TextView>(R.id.chng)
        clck1.setOnClickListener(View.OnClickListener {
            var day:String = randomDay()
            var food = fishFood(day)
            var a :Int = temp1.text.toString().toInt()
            var b :Int = level1.text.toString().toInt()
            view1.setText("Today is  "+ day)
            food1.setText(", you need to feed "+fishFood(day) )
            chng1.setText(" ,water chanage: "+change(day,a,b))

        })
    }
}
fun randomDay():String{
    var day=""
    var num :Int = Random().nextInt(7)
    when(num){
        1-> day="Monday"
        2-> day="Tuesday"
        3-> day="Wednesday"
        4-> day="Thursday"
        5-> day="Friday"
        6-> day="Saturday"
        7-> day="Sunday"
    }
    return day
}
fun fishFood(day:String):String {
    var food:String =""
    when(day){
        "Monday"-> food="flakes"
        "Tuesday"-> food="pellets"
        "Wednesday"-> food="redworms"
        "Thursday"-> food="granules"
        "Friday"-> food="mosquitoes"
        "Saturday"-> food="lettuce"
        "Sunday"-> food="plankton"
    }
    return food
}
fun change(day:String , temp1 :Int ,level : Int):Boolean = if (day=="Sunday" || temp1>30 || level>30)  true else  false