package org.example.day3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main( String[] args ) {
        maxMinArray();
        insertArray();
        specialValue();
        duplicateValue();
        reverseArray();
        findSecondLargest();
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
        private static boolean contain(int[] arr, int item){

            for (int n : arr) {
                if (item == n) {
                    return true;
                }
            }
            return false;
        }
        private static void specialValue(){
        int[] myArray = {20,30,40,50,60};
        System.out.println(contain(myArray,40));

    }
        //Bai 7: Write a Java program to find the duplicate values of an array of string values
        private static void duplicateValue() {
            String[] myArray = {"Khoa hoc", "Nghe thuat", "Khoa hoc", "Kinh te", "Chinh tri"};
            for (int i = 0; i < myArray.length - 1; i++) {
                for (int j = i+1; j < myArray.length; j++) {
                    if (myArray[i].equals(myArray[j]) && (i != j)) {
                        System.out.println("Dupliate value array is:" + myArray[j]);
                    }
                }

            }
        }

        //Bai 10: Write a Java program to reverse an array of integer values
        private static void reverseArray(){
        int[] myArray = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println("Mang goc:" + Arrays.toString(myArray));
            for (int i = 0; i < myArray.length/2; i ++){
                int temp = myArray[i];
                myArray[i] = myArray[myArray.length - i -1];
                myArray[myArray.length - i -1] = temp;
            }
            System.out.println("Mang dao chieu: " + Arrays.toString(myArray));
        }
        //Bai 11: Write a Java program to find the second largest element in an array.
        private static void findSecondLargest(){
            int[] myArray = {23, 45, 67, 78, 89, 105};
            System.out.println("Mang goc:" + Arrays.toString(myArray));
            Arrays.sort(myArray);
            int index = myArray.length-1;
            while (myArray[index] ==myArray[myArray.length-1]){
                index --;

            }
            System.out.println("So lon thu hai cua mang: " +myArray[index]);
        }
    }
