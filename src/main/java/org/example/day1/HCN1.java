package org.example.day1;

import java.util.Scanner;

public class HCN1 {
    public static void main(String[] args) {
        //Khai bao chieu dai, chieu rong
        double a, b;
        //Nhap du lieu
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu dai:");
        a = in.nextDouble();
        System.out.print("Nhap chieu rong:");
        b = in.nextDouble();
        //Nhap xong dong scanner
        in.close();
        if (a > 0 && b > 0) {
                double cv = (a + b) * 2;
                //In co dinh dang
                System.out.printf("Chu vi la %.2f \n", cv);
            } else {
                System.out.println("Cac ban phai nhap so duong");
            }

        System.out.println("Ket thuc chuong trinh");
        //Mở rộng: cho phép tính chu vi hình chữ nhật bằng cách truyền trực tiếp tham số
        //Nếu ko có tham số  -> cho phép nhập từ bàn phím
        //java HCN 3 4 -> tính luôn
        //java HCN -> hỏi nhập chiều dài, chiều rộng??
    }
}
