package com.example.lab1kotlin

import kotlin.random.Random

//fun main(args: Array<String>) {
//    var rd = Random
//    var rdNguyen = rd.nextInt(1)
//    println(rdNguyen)
//
//
//    // random trong doan a den sat b
//
//    var rd2 = rd.nextInt(-100,50)
//    println(rd2)
//
//    // random so thuc
//
//    var rd3 = rd.nextDouble()
//
//    println(rd3)
//
//
//}
fun play() {
    var rd = Random
    var soMay = rd.nextInt(100)
    println(soMay)
    var dem = 1
    while (true) {
        println("moi chon so 1-99")
        var nguoiDoan: Int? = readLine()?.toInt()
        if (nguoiDoan == null) return
        if (dem == 7) {
            println("ban da choi het 7 lan")
            break
        } else {
            dem++
            if (nguoiDoan == soMay) {
                println("ban da doan dung $soMay")
                break
            } else if (nguoiDoan < soMay)
                println("so nay nho hon")
            else

                println("so nay lon hon")

        }
    }
}
fun main(args: Array<String>) {
    while (true)
    {
        play()
        println("Ban co muon choi tiep khong (y/n)")
        var s:String? = readLine()
        if (s!= null)
        {
            if (s=="n" || s== "N")
            {
                println("cam on may see you again")
                break
            }
        }
    }

}