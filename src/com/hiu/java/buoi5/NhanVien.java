package com.hiu.java.buoi5;

public class NhanVien {

    private String ho;
    private String ten;
    private int soSP;

    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        this.soSP = soSP;
    }

    public void xuatThongTin() {
        System.out.println("Ho: " + ho);
        System.out.println("Ten: " + ten);
        System.out.println("So san pham: " + soSP);
    }
}