package org.example.day2;

import java.util.Scanner;

public class Exercise2New {
    public static void main(String[] args) {
        //findNumber();
        //existValue();
        sortArr();
    }

    //Bài 169: Cho mảng một chiều các số nguyên. Hãy viết hàm tìm số chẵn lớn nhất nhỏhơn mọi giá trịlẻcó trong mảng.
    private static void findNumber() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong phan tu của mang:");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("\nNhap phan tu thu " + i + ":");
            a[i] = sc.nextInt();

        }
        System.out.println("Cac phan tu trong mang la:");
        for (double i : a) {
            System.out.println(i + ",");
        }
        int minl = 2000;
        for (int i = 1; i <= n; i++) {
            if (a[i] % 2 != 0 && a[i] < minl) {
                minl = a[i];
            }
        }
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] % 2 == 0 && a[i] < minl && a[i] > j)
                j = a[i];
        }
        System.out.printf("\nSo chan lon nhat trong mang la %d:", j);

    }

    //Bài 240: Hãy kiểm tra mảng sốnguyên có tồn tại giá trịkhông hay không? Nếu không tồn tại giá trịkhông trảvềgiá trị0, ngược lại trảvề1 (tontaikhong).
    private static void existValue() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong phan tu của mang:");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap phan tu thu " + i + ":");
            a[i] = sc.nextInt();

        }
        System.out.println("Cac phan tu trong mang la: ");
        for (int i : a) {
            System.out.print(i + ",");
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                System.out.printf("\n Mang co gia tri 0");
                break;
            } else {
                System.out.printf("\n Mang khong co gia tri 0");
                break;
            }


        }
    }
    //Bài 255: Hãy sắp xếp các giá trị trong mảng các số thực tăng dần(sapxeptang).
    private static void sortArr() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong phan tu của mang:");
        n = (int) sc.nextFloat();
        float a[] = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap phan tu thu " + i + ":");
            a[i] = sc.nextFloat();

        }
        System.out.println("Cac phan tu trong mang la: ");
        for (float i : a) {
            System.out.print(i + ",");
        }

        float temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        System.out.println("Cac phan tu trong mang tang dan la: ");
        for (float i : a) {
            System.out.print(i + ",");
        }
    }
}

