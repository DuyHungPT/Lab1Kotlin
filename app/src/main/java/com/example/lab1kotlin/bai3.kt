package com.example.lab1kotlin

fun main(args: Array<String>) {
//    for (i in 1 .. 9)
//    {
//        for (j in 2 .. 9)
//        {
//            println("$i * $j = ${i*j}")
//            println("----------------")
//        }
//    }

    // chu N

//    var  h = 7
//    for (i in 1 .. h)
//    {
//        for (j in 1 .. h)
//        {
//           if (j == 1 || j == h || i ==j)
//
//               print("*")
//               print("\t")
//
//
//        }
//        println()
//    }

    // trai tim

    var  h = 7
    for (i in 1 .. h)
    {
        for (j in 1 .. h)
        {
           if ((i==1)&& (j==2 || j == 3 || j== 5 || j == 6) || (i ==2) && (j==1 || j== 4 || j == 7) || (i==3)&& (j==1 || j==7) || (i==4)&& (j==2 || j == 6) || (i==5) && (j==3 || j == 5) || (i==6) && j==4)
               print("@")
            print("\t")


        }
        println()
    }

}