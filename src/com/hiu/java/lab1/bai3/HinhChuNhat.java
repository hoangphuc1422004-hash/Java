package com.hiu.java.lab1.bai3;

public class HinhChuNhat  extends Hinh {

    // Thuộc tính
    protected double chieuDai;
    protected double chieuRong;

    // Constructor
    public HinhChuNhat(String mau, double chieuDai, double chieuRong) {
        super(mau);

        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Tính diện tích
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Tính chu vi
    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    // Lấy thông tin
    @Override
    public String layThongTin() {
        return "Hinh Chu Nhat - Mau: " + mau +
                ", Chieu dai: " + chieuDai +
                ", Chieu rong: " + chieuRong +
                ", Dien tich: " + tinhDienTich() +
                ", Chu vi: " + tinhChuVi();
    }
}
