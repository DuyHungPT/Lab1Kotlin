package com.example.lab1kotlin

fun main(args: Array<String>) {
//    var  i = 0
//    while (i <= 5)
//    {
//        println(i)
//        i++
//    }
//    println("i, = $i")

    // while

//    var  n = 0
//    while (n < 1 || n > 9)
//    {
//        println("Moi Nhap So nguyen")
//        var s:String? = readLine()
//        if (s!= null)
//            n=s.toInt()
//    }
//    println("ban nhap hop le: $n")

    // do while

//    var i = 1
//    var  tong = 0
//    do {
//      tong += i++
//    }while (i<= 5)
//    println("tong cac so $tong")

    // while true

//    while (true)
//    {
//        println("ban co muon thoat khong ? (nhan y de thoat)")
//        var s:String? = readLine()
//        if (s=="y" || s=="Y")
//            break
//    }
//    println("Cam on Ban ")

    var  n = 0
    while (true)
    {
        n++
        println("n = $n")
        if (n == 10)
            break
    }
    println("Cam on Ban, n= $n ")
}