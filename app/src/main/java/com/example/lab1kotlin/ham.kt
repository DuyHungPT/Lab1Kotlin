package com.example.lab1kotlin
fun TinhTong(a:Int, b:Int , c:Int): Int
{
    return a+b+c
}
fun XinChao ()
{
    println("Chao moi nguoi")
}
fun XinChao2 (s:String)
{
    if (s=="nam")
        println("xin chao tao la nam")
    if (s=="nu")
        println("xin chao tao la nu")
}
fun main(args: Array<String>) {
   var tong = TinhTong(1,2,3)
    println(tong)
    XinChao()
    XinChao2("nu")
}