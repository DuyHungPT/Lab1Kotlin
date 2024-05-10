package com.example.lab1kotlin

//import kotlin.math.sqrt
//
//fun giaiPTB2 (a:Double,b:Double,c:Double):String
//{
//    if (a == 0.0)
//    {
//        if (b==0.0 && c== 0.0)
//            return "Pt vo so nghiem"
//        else if (b == 0.0 && c!= 0.0)
//            return "Pt vo nghiem"
//        else
//            return "Pt co nghiem x = ${-c/b}"
//    }
//    else
//    {
//        var delta = (b*b)-(4*a*c)
//        if (delta<0)
//            return "Pt vo nghiem"
//        else if (delta == 0.0)
//        {
//            var x = -b/(2*a)
//            return "pt co nghiem kep x1 = x2 = $x"
//        }else
//        {
//            var x1 = (-b + sqrt(delta))/(2*a)
//            var x2 = (-b - sqrt(delta))/(2*a)
//            return "pt co 2 nghiem phan biet,x1 = $x1,x2 = $x2"
//        }
//    }
//}
//fun main(args: Array<String>) {
//   println("moi nhap vao a: ")
//    var a:Double? = readLine()?.toDouble()
//    println("moi nhap vao b: ")
//    var b:Double? = readLine()?.toDouble()
//    println("moi nhap vao c: ")
//    var c:Double? = readLine()?.toDouble()
//
//    if (a!= null && b!=null && c!=null)
//    {
//        var kq = giaiPTB2(a,b,c)
//        println(kq)
//    }
//}

fun Tong(a:Double,b:Double)
{
    println("$a + $b = ${a+b}")
}
fun Hieu(a:Double,b:Double)
{
    println("$a - $b = ${a-b}")
}
fun Tich(a:Double,b:Double)
{
    println("$a * $b = ${a*b}")
}
fun Thuong(a:Double,b:Double)
{
    if (b==0.0)
        println("khong chia duoc cho 0")
    else

    println("$a / $b = ${a/b}")
}


fun main(args:Array<String>)
{
   println("moi nhap a: ")
    var a:Double? = readLine()?.toDouble()
    println("moi nhap b: ")
    var b:Double? = readLine()?.toDouble()
    println("moi nhap phep tinh (+ - * /):: ")
    var c:String? = readLine()

    if (a!=null && b!= null && c!=null)
    {
//        if (c=="+")
//            Tong(a,b)
//        else if (c=="-")
//            Hieu(a,b)
//        else if (c=="*")
//            Tich(a,b)
//        else if (c=="/")
//            Thuong(a,b)
//        else
//            println("Tao Chua Hoc cai nay")

        // su dung when

        when (c)
        {
            "+" -> println("$a + $b = ${a+b}")
            "-" -> println("$a - $b = ${a-b}")
            "*" -> println("$a * $b = ${a*b}")
            "/" ->if (b==0.0)
                println("khong chia duoc cho 0")
            else
                println("$a / $b = ${a/b}")
            else ->
                println("khong thuc hien duoc")
        }
    }
}
