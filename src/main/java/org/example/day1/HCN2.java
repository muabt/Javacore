package org.example.day1;

import java.util.Scanner;

public class HCN2 {
    public static void main(String[] args) {
        //Tính chu vi TH False thì quay vòng
        double a, b;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap chieu dai:");
            a = in.nextDouble();
            System.out.print("Nhap chieu rong:");
            b = in.nextDouble();
            if (a > 0 && b > 0)
            {
                break;
            } else{
                System.out.println("Cac ban phai nhap so duong");
            }
        }
        in.close();

                   double cv = (a + b) * 2;
            //In co dinh dang
            System.out.printf("Chu vi la %.2f \n", cv);

        System.out.println("Ket thuc chuong trinh");

    }
}
