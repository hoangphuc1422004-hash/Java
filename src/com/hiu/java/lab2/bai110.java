package com.hiu.java.lab2;

import java.util.Scanner;

public class bai110 {

    /**
     * Giải mã chuỗi nén (cipher text) về chuỗi gốc (plain text).
     * Quy tắc: '#' + digit(N) + char(C)  =>  C lặp N lần
     * Ví dụ: #6Z => ZZZZZZ,  #3 9 => 999
     */
    public static String decode(String cipher) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < cipher.length()) {
            char c = cipher.charAt(i);
            if (c == '#') {
                // Ký tự tiếp theo là số lần lặp (1–9)
                int repeat = cipher.charAt(i + 1) - '0';
                char ch = cipher.charAt(i + 2);
                result.append(String.valueOf(ch).repeat(repeat));
                i += 3; // bỏ qua '#', digit, char
            } else {
                result.append(c);
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap cipher text: ");
        String cipher = scanner.nextLine();

        String plain = decode(cipher);
        System.out.println("Plain text: " + plain);

        scanner.close();
    }
}
