package com.example.lab1kotlin

fun main () {
    // khai bao va su dung bien
    val a = 1
    var b = 2
    b = 3

    val c = (a + b)

    val d : String = "tong 2 so $a va $b : $c"
    println(d)
    val kq =   phepChia(1,3f)
    println(kq)

    val arrX = intArrayOf(1,2,3,4)
    arrX[3] = 5
    arrX[arrX.size -1] = 5

    println(arrX.asList())

    for (i in arrX.indices){
        println("Phan Tu Thu $i trong mang la : ${arrX[i]}")
    }

    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))


    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

fun phepChia (soA: Int, soB : Float) : String {

    if (soB == 0f){

        return "So B phai khac 0 "

    }
     val c = soA / soB

    return "thuong 2 so $soA va $soB =  $c"

    return ""
}
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

