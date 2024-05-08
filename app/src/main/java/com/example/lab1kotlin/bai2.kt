package com.example.lab1kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {

    // tong
//    var  tong = 0
//    println(tong::class.java.typeName)
//    for (i in 1 .. 15 step 2)
//    {
//        println(i)
//        tong=tong+i
//        println(tong)
//    }
//    println("tong la: $tong")

    // for downto

//    for (i in 9 downTo 1)
//    {
//        println(i)
//    }

    // for
    var dsTen = arrayOf("anh1.jpg","anh2.jpg","anh3.jpg")
    for (item in dsTen)
    {
        println(item)
    }
}


















