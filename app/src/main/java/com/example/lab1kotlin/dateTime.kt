package com.example.lab1kotlin

import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
//    var cal = Calendar.getInstance()
//    println(cal)
//    var nam = cal.get(Calendar.YEAR)
//    var thang = cal.get(Calendar.MONTH)
//    var ngay = cal.get(Calendar.DAY_OF_MONTH)
//    var gio = cal.get(Calendar.HOUR_OF_DAY)
//    println("ngay thang nam la = $ngay/${thang+1}/$nam/$gio")
//
//    cal.set(Calendar.YEAR,1990)
//    cal.set(Calendar.MONTH,5)
//    cal.set(Calendar.DAY_OF_MONTH,9)
//    // kiem tra date sau thiet lap
//
//    var namSinh = cal.get(Calendar.YEAR)
//    var thangSinh = cal.get(Calendar.MONTH)
//    var ngaySinh = cal.get(Calendar.DAY_OF_MONTH)
//    println("ngay thang nam sing la: $ngaySinh/$thangSinh/$namSinh")
//
//    var date = cal.time
//    // khai bao dinh dang
//    var  dinhDang = SimpleDateFormat("dd/MM/yyyy")
//    println(dinhDang.format(date))
//
//
//    // dinh dang loai 2
//     var dinhDang2 = SimpleDateFormat("dd/MM/yyyy/ hh:mm:ss a")
//    println(dinhDang2.format(date))

    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
    println("moi nhap ngay thang nam sinh")
    var s = readln()
    if (s == null) return
    var dateInput = dinhDang.parse(s)
    // khoi tao date time
    var timeNamSinh = Calendar.getInstance()
    println(timeNamSinh)

        // set time nam sinh = thoi gian nhap vao
    timeNamSinh.time = dateInput
    var namSinh = timeNamSinh.get(Calendar.YEAR)
    var thangSinh = timeNamSinh.get(Calendar.MONTH)
    var ngaySinh = timeNamSinh.get(Calendar.DAY_OF_MONTH)
    println("ngay thang nam sinh cua ban la: $ngaySinh/${thangSinh+1}/$namSinh")

    // khoi tao bien date time
    var timeHienTai = Calendar.getInstance()
    // lay nam hien tai
    var namHienTai = timeHienTai.get(Calendar.YEAR)
    // tinh tuoi
    var tuoi = namHienTai - namSinh
    println("Ban sinh nam: $namSinh, hien tai $tuoi tuoi")
}