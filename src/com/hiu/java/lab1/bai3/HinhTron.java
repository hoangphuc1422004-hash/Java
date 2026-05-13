package com.hiu.java.lab1.bai3;

public class HinhTron  extends Hinh {

    // Thuộc tính
    private double banKinh;

    // Constructor
    public HinhTron(String mau, double banKinh) {
        super(mau);
        this.banKinh = banKinh;
    }

    // Tính diện tích
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Tính chu vi
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Lấy thông tin
    @Override
    public String layThongTin() {
        return "Hinh Tron - Mau: " + mau +
                ", Ban kinh: " + banKinh +
                ", Dien tich: " + tinhDienTich() +
                ", Chu vi: " + tinhChuVi();
    }
}
