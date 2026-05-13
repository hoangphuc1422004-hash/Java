package com.hiu.java.lab1.bai3;

public class Main {
    public static void main(String[] args) {

        // Hình chữ nhật
        HinhChuNhat hcn = new HinhChuNhat("Do", 10, 5);
        System.out.println(hcn.layThongTin());

        // Hình vuông
        HinhVuong hv = new HinhVuong("Xanh", 4);
        System.out.println(hv.layThongTin());

        // Hình tròn
        HinhTron ht = new HinhTron("Vang", 3);
        System.out.println(ht.layThongTin());
    }
}
