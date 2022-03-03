package org.example.day3.arrays;

import java.util.Scanner;

public class Exercise3 {
    public static void main( String[] args ) {
       // maxMinArray();
        insertArray();
    }

       //Bai 3: Write a Java program to find the maximum and minimum value of an array.
       private static void maxMinArray() {
           Scanner sc = new Scanner(System.in);
           int n;
           System.out.println("Nhap so luong phan tu của mang:");
           n = sc.nextInt();
           int numberArr[] = new int[n];
           for (int i = 0; i < n; i++) {
               System.out.println("\nNhap phan tu thu " + i + ":");
               numberArr[i] = sc.nextInt();

           }
           System.out.println("Cac phan tu trong mang la:");
           for (double i : numberArr) {
               System.out.println(i + ",");
           }
           double max = numberArr[0];
           double min = numberArr[0];
           for (double num : numberArr) {
               if (max < num) {
                   max = num;
               }
               if (min > num) {
                   min = num;
               }
           }
           System.out.printf("\nSo lon nhat tr0ng mang la:%.2f", max);
           System.out.printf("\nSo lon nhat tr0ng mang la:%.2f", min);
       }

       //Bai 4: Write a Java program to insert an element (specific position) into an array.
        private static void insertArray(){
            Scanner sc = new Scanner(System.in);
            int n, pos, x;
            System.out.println("Nhap so luong phan tu của mang:");
            n = sc.nextInt();
            int numberArr[] = new int[n+1];
            for (int i = 0; i < n; i++) {
                System.out.println("\nNhap phan tu thu " + i + ":");
                numberArr[i] = sc.nextInt();

            }
            System.out.println("Cac phan tu trong mang la:");
            for (double i : numberArr) {
                System.out.print(i + ",");
            }
            System.out.print("Nhap vi tri muon chen phan tu vao mang:");
            pos = sc.nextInt();
            System.out.print("Nhap phan tu ban muon chen vao mang:");
            x = sc.nextInt();
            for (int i = (n-1); i >= (pos - 1); i--){
                numberArr[i+1] = numberArr[i];
            }
            numberArr[pos-1] = x;
            System.out.println("Sau khi chen:");
            for (int i = 0; i < n; i++)
            {
                System.out.print(numberArr[i]+",");
            }
            System.out.print(numberArr[n]);

        }
        //Bai 6: Write a Java program to test if an array contains a specific value.

}
