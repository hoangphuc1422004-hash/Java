package com.hiu.java.buoi5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin nhan vien:");

        System.out.print("Ho: ");
        String ho = sc.nextLine();

        System.out.print("Ten: ");
        String ten = sc.nextLine();

        System.out.print("So san pham: ");
        int sp = sc.nextInt();

        NhanVien nv = new NhanVien(ho, ten, sp);

        System.out.println("\nThong tin nhan vien:");
        nv.xuatThongTin();

        sc.close();
    }
}