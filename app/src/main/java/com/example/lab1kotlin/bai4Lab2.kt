package com.example.lab1kotlin

//fun main () {
//    val sv1 = SinhVienModel("Nguyen Van Long", "PH11341", 8f)
//
//    val sv2 = SinhVienModel("Tran Tuan Anh", "PH12541", 9f)
//
//    sv2.daTotNghiep = false
//    sv2.tuoi = 22
//
//    val sv3 = SinhVienModel("Tran Thu Phuong", "PH12533", 8.5f, false, 22)
//
//    val listSV = mutableListOf<SinhVienModel>()
//    listSV.add(sv1)
//    listSV.add(sv2)
//    listSV.add(sv3)
//    listSV.removeAt(listSV.size - 1)
//
//    for (sinhvien in listSV) {
//        println(sinhvien.getThongTin())
//    }
//
//    for (i in listSV.indices) {
//        println("SV thu $i: \n ${listSV.get(i).getThongTin()}")
//    }
//}

// Định nghĩa lớp SinhvienModel
class SinhvienModel(var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep: Boolean? = null
    var tuoi: Int? = null

    constructor(tenSV: String, mssv: String, diemTB: Float, daTotNghiep: Boolean?, tuoi: Int?) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }

    fun getThongTin(): String {
        val totNghiepText = daTotNghiep?.let { if (it) "Đã tốt nghiệp" else "Chưa tốt nghiệp" } ?: "Chưa có dữ liệu"
        val tuoi = tuoi?.toString() ?: "Chưa có dữ liệu"

        return "Tên: $tenSV, MSSV: $mssv, Điểm TB: $diemTB, Đã tốt nghiệp: $totNghiepText, Tuổi: $tuoi"
    }
}

// Chức năng để thêm sinh viên vào danh sách
fun themSinhVien(danhSach: MutableList<SinhvienModel>, sv: SinhvienModel) {
    danhSach.add(sv)
}

// Chức năng để xóa sinh viên bằng MSSV
fun xoaSinhVien(danhSach: MutableList<SinhvienModel>, mssv: String) {
    danhSach.removeIf { it.mssv == mssv }
}

// Chức năng để xem danh sách sinh viên
fun xemDanhSach(danhSach: List<SinhvienModel>) {
    if (danhSach.isEmpty()) {
        println("Danh sách sinh viên trống.")
    } else {
        for ((index, sv) in danhSach.withIndex()) {
            println("Sinh viên thứ $index:\n${sv.getThongTin()}")
        }
    }
}

// Chương trình chính
fun main() {
    // Tạo danh sách sinh viên
    val danhSachSinhVien = mutableListOf<SinhvienModel>()

    // Thêm sinh viên vào danh sách
    themSinhVien(danhSachSinhVien, SinhvienModel("Nguyễn Văn Long", "PH11341", 8f))
    themSinhVien(danhSachSinhVien, SinhvienModel("Trần Tuấn Anh", "PH12541", 9f, false, 22))
    themSinhVien(danhSachSinhVien, SinhvienModel("Trần Thu Phương", "PH12533", 8.5f, false, 22))
    themSinhVien(danhSachSinhVien, SinhvienModel("Trinh Thi Nhung", "ph43753", 9.5f, false, 52))

    // Xóa sinh viên
    xoaSinhVien(danhSachSinhVien, "PH11341")

    // Xem danh sách sinh viên
    xemDanhSach(danhSachSinhVien)
}
