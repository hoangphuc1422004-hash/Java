package com.hiu.java.lab2;

import java.util.Scanner;

public class bai117 {

    /**
     * Tính tổng bình phương của tất cả các "số con" (subnumber) của n.
     * Số con là số tạo thành từ một dãy chữ số liên tiếp của n.
     *
     * Ví dụ: n = 2207
     *   Độ dài 4: "2207" -> 2207
     *   Độ dài 3: "220", "207"
     *   Độ dài 2: "22", "20", "07"
     *   Độ dài 1: "2", "2", "0", "7"
     *   S = 2207^2 + 220^2 + 207^2 + 22^2 + 20^2 + 7^2 + 4 + 4 + 0 + 49
     *     = 4963088
     */
    static long sumOfSquaredSubnumbers(String digits) {
        long sum = 0;
        int len = digits.length();
        for (int start = 0; start < len; start++) {
            for (int end = start + 1; end <= len; end++) {
                long sub = Long.parseLong(digits.substring(start, end));
                sum += sub * sub;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        String n = scanner.next(); // đọc dạng chuỗi để giữ số 0 đầu (nếu có)

        // Loại bỏ dấu trừ nếu nhập số âm (đề yêu cầu n > 0)
        if (n.startsWith("-")) {
            System.out.println("n phai la so nguyen duong (n > 0)!");
            scanner.close();
            return;
        }

        long S = sumOfSquaredSubnumbers(n);
        System.out.println("S = " + S);

        scanner.close();
    }
}
