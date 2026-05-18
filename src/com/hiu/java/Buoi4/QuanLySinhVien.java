package com.hiu.java.Buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {

    public static void main(String[] args) {

        ArrayList<String> dsSinhVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\n---------- MENU QUẢN LÝ ----------");
            System.out.println("a. Thêm Sinh viên");
            System.out.println("b. Xuất danh sách sinh viên");
            System.out.println("c. Sửa Sinh Viên");
            System.out.println("d. Xóa Sinh viên");
            System.out.println("e. Tìm Sinh viên tên có chữ 'An'");
            System.out.println("f. Sắp xếp Sinh Viên");
            System.out.println("g. Xuất số lượng sinh viên");
            System.out.println("0. Thoát");

            System.out.print("Mời bạn chọn: ");

            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("0")) {
                break;
            }

            if (input.isEmpty()) {
                continue;
            }

            char option = input.charAt(0);

            switch (option) {

                case 'a':

                    System.out.print("Nhập tên sinh viên cần thêm: ");
                    dsSinhVien.add(sc.nextLine());

                    System.out.println("Đã thêm thành công!");
                    break;

                case 'b':

                    if (dsSinhVien.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {

                        System.out.println("Danh sách sinh viên:");

                        for (int i = 0; i < dsSinhVien.size(); i++) {
                            System.out.println((i + 1) + ". " + dsSinhVien.get(i));
                        }
                    }

                    break;

                case 'c':

                    System.out.print("Nhập vị trí muốn sửa: ");

                    try {

                        int indexSua = Integer.parseInt(sc.nextLine()) - 1;

                        if (indexSua >= 0 && indexSua < dsSinhVien.size()) {

                            System.out.print("Nhập tên mới: ");

                            dsSinhVien.set(indexSua, sc.nextLine());

                            System.out.println("Cập nhật thành công!");

                        } else {

                            System.out.println("Vị trí không tồn tại!");
                        }

                    } catch (Exception ex) {

                        System.out.println("Vui lòng nhập số!");
                    }

                    break;

                case 'd':

                    System.out.print("Nhập tên muốn xóa: ");

                    String tenXoa = sc.nextLine();

                    if (dsSinhVien.remove(tenXoa)) {

                        System.out.println("Đã xóa thành công!");

                    } else {

                        System.out.println("Không tìm thấy sinh viên!");
                    }

                    break;

                case 'e':

                    System.out.println("Các sinh viên chứa 'An':");

                    boolean found = false;

                    for (String sv : dsSinhVien) {

                        if (sv.toLowerCase().contains("an")) {

                            System.out.println("- " + sv);

                            found = true;
                        }
                    }

                    if (!found) {

                        System.out.println("Không tìm thấy!");
                    }

                    break;

                case 'f':

                    Collections.sort(dsSinhVien);

                    System.out.println("Đã sắp xếp A-Z.");

                    break;

                case 'g':

                    System.out.println("Tổng số sinh viên: " + dsSinhVien.size());

                    break;

                default:

                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (true);

        System.out.println("Tạm biệt!");

        sc.close();
    }
}