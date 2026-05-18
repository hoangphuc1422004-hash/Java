package com.hiu.java.lab2;

import java.util.Scanner;

public class bai114 {

    /** Đảo ngược số nguyên, ví dụ: 23 -> 32, 100 -> 1 */
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    /** Ước chung lớn nhất (Euclidean) */
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * Số thân thiện: n và đảo ngược của n có GCD = 1
     * Lưu ý: n phải khác đảo ngược của nó (để tránh trường hợp palindrome
     * tự thân thiện với chính mình).
     * Theo ví dụ đề bài: 23 thân thiện vì reverse(23)=32, GCD(23,32)=1
     */
    static boolean isFriendly(int n) {
        int rev = reverse(n);
        // n và rev phải khác nhau; nếu giống nhau (palindrome) thì không tính
        if (n == rev) return false;
        return gcd(n, rev) == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a (10 <= a): ");
        int a = scanner.nextInt();
        System.out.print("Nhap b (b <= 30000): ");
        int b = scanner.nextInt();

        System.out.println("Cac so than thien trong khoang [" + a + ", " + b + "]:");
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int n = a; n <= b; n++) {
            if (isFriendly(n)) {
                if (count > 0) sb.append(", ");
                sb.append(n);
                count++;
            }
        }
        System.out.println(sb);
        System.out.println("So luong: " + count);

        scanner.close();
    }
}
