package com.example.lab1kotlin

fun main(args: Array<String>) {
//    var n = 0
//    while (n < 100)
//    {
//        n++
//        println("n = $n")
//        if (n == 10)
//            break
//    }

    //continue
//    var tong = 0
//    for (i in 1 .. 5)
//    {
//        if (i == 3)
//            continue
//        else{
//            println(i)
//            tong+= i
//        }
//
//    }
//    println("tong = $tong")

//    var gt = 1
//    println("moi nhan vao so nguyen n")
//    var n: Int? = readln()?.toInt()
//    if (n != null)
//    {
//        for (i in 1 .. n)
//            gt*= i
//
//    }
//    println("$n = $gt")

//    var gt = 1
//
//    var i = 1
//    println("moi nhan vao so nguyen n")
//    var n: Int? = readln()?.toInt()
//    if (n != null)
//    {
//       while (i <= n)
//       {
//            gt*= i
//           i++
//       }
//
//    }
//    println("$n = $gt")

//    var  tong = 0
//    println("moi nhap vao  a")
//    var a:Int? = readLine()?.toInt()
//    if (a != null)
//    {
//        if (a % 2 == 0)
//        {
//        for (i in 0 .. a step 2)
//        {
//            tong+= i
//
//        }
//            println("tong cac so chan $a = $tong")
//        }else
//        {
//            println(" vi $a a la so le khong tinh tong")
//        }
//    }

    // tong cac so le

//    var tong = 0
//    println("moi nhan vao si nguyen n")
//    var n:Int? = readLine()?.toInt()
//    if (n != null)
//    {
//        for (i in 1 .. n)
//        {
//            if (i % 2 != 0)
//            {
//                if (i == 3)
//                    continue
//                else {
//                    tong+= i
//                }
//            }
//        }
//        println("tong = $tong")
//    }

       //

//    for (i in 10 .. 50 )
//        if (i % 3 == 0)
//            println("$i  ")

//    var tong = 0
//    var gt = 1
//    for (i in 1 .. 10)
//    {
//        gt*=i
//        tong += gt
//
//
//    }
//    println("$ = $tong")

//    println("moi nhap vao so nguyen n")
//    var n:Int? = readLine()?.toInt()

    // tim so hoan hao

//    for (n in 1 .. 1000)
//
//    {
//        if (n != null)
//        {
//            var tong = 0
//            for (i in 1 until n)
//            {
//                if (n%i ==0)
//                {
//
//                    tong+= i
//                }
//            }
//            if (tong == n)
//             print("$n ")
//        }
//    }

    // tim so nguyen to ..............

   while (true)

   {
       println("moi nhap vao so nguyen n")
       var n:Int? = readLine()?.toInt()
       if (n != null)
       {
           var demUoc =0
           for (i in 1 .. n)
               if (n%i == 0)
                   demUoc++
           if (demUoc == 2)
               println("$n la so nguyen to")
           else
               println("$n khong phai la so nguyen to")
       }
       println("ban co muon tiep tuc ko N de thoat")
       var s:String? = readLine()
       if (s!= null)
       {
           if (s== "n"|| s== "N")
           {
               println("Da Thoat")
               break
           }

       }
   }


}












