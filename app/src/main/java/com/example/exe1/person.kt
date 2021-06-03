package com.example.exe1

class person {
    var name:String? = null
    set(value){
            field=value?.toUpperCase()
    }
    var gender:String? = null
    var age:Int = 0
    get()= field
    set(value)=if(value<18) print("person is minor") else field=value
}