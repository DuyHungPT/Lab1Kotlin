package com.example.lab1kotlin

fun main() {
    // khai bao va su dung ki thuat null safety
     var masv : String? = "PH1234"

//     var tenSV: String = null
     val tenSV = getTenSV(masv!!)
     println("Ten sinh Vien voi ma $masv : $tenSV")

     println("nhap ma sinh vien ")
     val massv : String? = readLine()

}

val dangSachSV : Map<String,String> = mutableMapOf("PH1234" to "Nguyen Ngoc Hung","Ph43753" to "Nguyen Ngoc Anh","PH4567" to "Tran Duy Hung")
fun getTenSV (mssv : String) : String? {
     val  tenSV = dangSachSV.get(mssv)

     if (tenSV == null){
          return "ko tim thay"
     }

     return tenSV

}