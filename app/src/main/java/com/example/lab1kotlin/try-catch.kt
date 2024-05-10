package com.example.lab1kotlin

//fun main(args: Array<String>) {
//    var a = 10
//    var b = 0
//    var c = a/b
//    try {
//        var c=a/b
//        println(c)
//
//    }catch (e:Exception)
//    {
//        e.printStackTrace()
//    }
//    finally {
//        println("Thoat khoi csdl")
//    }
//   println("Hello")
//
//
//}

               // throw
fun Thuong(a:Int,b:Int):Int
               {
    if (b==0)
        throw Exception("Mau = 0 ko chia dc")
                   return a/b
}

fun main(args: Array<String>) {
    try {
        var c = Thuong(5,0)
        println(c)
    }catch (e:Exception)
    {
        println(e.message)
    }

    println("code")
}