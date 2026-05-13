package com.hiu.java.lab1;

import java.util.Scanner;

public class bai1 {

    // Hàm tìm UCLN
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm kiểm tra số hoàn thiện
    public static boolean soHoanThien(int n) {
        int tong = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }

    // Hàm kiểm tra các chữ số đều chẵn
    public static boolean toanChuSoChan(int n) {
        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    // Hàm tính giai thừa
    public static long giaiThua(int n) {
        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    // Hàm tính S(x,n)
    public static double tinhTong(double x, int n) {
        double S = x;

        for (int i = 1; i <= n; i++) {
            int mu = 2 * i + 1;
            double tu = Math.pow(x, mu);
            long mau = giaiThua(mu);

            S += tu / mau;
        }

        return S;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Bài 1: Tìm UCLN =====
        System.out.println("===== TIM UCLN =====");
        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("UCLN = " + UCLN(a, b));

        // ===== Bài 2: Kiểm tra số hoàn thiện =====
        System.out.println("\n===== KIEM TRA SO HOAN THIEN =====");
        System.out.print("Nhap n: ");
        int n1 = sc.nextInt();

        if (soHoanThien(n1)) {
            System.out.println(n1 + " la so hoan thien");
        } else {
            System.out.println(n1 + " khong phai so hoan thien");
        }

        // ===== Bài 3: Kiểm tra toàn chữ số chẵn =====
        System.out.println("\n===== KIEM TRA CHU SO CHAN =====");
        System.out.print("Nhap n: ");
        int n2 = sc.nextInt();

        if (toanChuSoChan(n2)) {
            System.out.println(n2 + " co toan chu so chan");
        } else {
            System.out.println(n2 + " khong phai toan chu so chan");
        }

        // ===== Bài 4: Tính tổng S(x,n) =====
        System.out.println("\n===== TINH TONG S(x,n) =====");

        System.out.print("Nhap x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        double ketQua = tinhTong(x, n);

        System.out.println("S(x,n) = " + ketQua);

        sc.close();
    }
}