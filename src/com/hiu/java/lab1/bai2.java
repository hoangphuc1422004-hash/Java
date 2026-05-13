package com.hiu.java.lab1;

import java.util.Scanner;

public class bai2 {

    // Hàm xuất các số nguyên âm trong chuỗi
    public static void NegativeNumberInStrings(String str) {

        boolean timThay = false;

        for (int i = 0; i < str.length(); i++) {

            // Kiểm tra dấu '-'
            if (str.charAt(i) == '-') {

                String soAm = "-";
                int j = i + 1;

                // Lấy các chữ số phía sau dấu -
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    soAm += str.charAt(j);
                    j++;
                }

                // Nếu có số phía sau dấu -
                if (soAm.length() > 1) {
                    System.out.println("So nguyen am tim thay: " + soAm);
                    timThay = true;
                }
            }
        }

        // Nếu không có số âm
        if (!timThay) {
            System.out.println("Khong co so nguyen am trong chuoi");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        NegativeNumberInStrings(str);

        sc.close();
    }
}