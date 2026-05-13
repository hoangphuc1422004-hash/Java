package com.hiu.java.lab1.bai3;

public class HinhVuong extends HinhChuNhat {

    // Constructor
    public HinhVuong(String mau, double canh) {
        super(mau, canh, canh);
    }

    // Lấy thông tin
    @Override
    public String layThongTin() {
        return "Hinh Vuong - Mau: " + mau +
                ", Canh: " + chieuDai +
                ", Dien tich: " + tinhDienTich() +
                ", Chu vi: " + tinhChuVi();
    }
}
