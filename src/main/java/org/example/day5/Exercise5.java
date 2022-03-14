package org.example.day5;


import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main (String[] args) {
        //ConvertString();
        printConsole();
    }

        //Bai 19: Write a java program to receive string (including firstname, surname and lastname) from user and convert to string with true syntax. Example:
         private static void ConvertString(){
             Scanner input = new Scanner(System.in);
             System.out.println("Nhap vao ten cua ban: ");
             String name = input.nextLine();
             String [] strings = name.split(" ");
             String firstName = strings[0];
             String surName = strings[1];
             String lastName = strings[2];
             String firstFirstName = firstName.substring(0,1);
             String remainingFirstName = firstName.substring(1, firstName.length());
             firstFirstName = firstFirstName.toUpperCase();
             remainingFirstName = remainingFirstName.toLowerCase();

             String firstSurName = surName.substring(0,1);
             String remainingSurName = surName.substring(1, surName.length());
             firstSurName = firstSurName.toUpperCase();
             remainingSurName = remainingSurName.toLowerCase();

             String firstLastName = lastName.substring(0,1);
             String remainingLastName = lastName.substring(1, lastName.length());
             firstLastName = firstLastName.toUpperCase();
             remainingLastName = remainingLastName.toLowerCase();

             System.out.printf("Ten cua ban la: %s \n", firstFirstName + remainingFirstName + " " + firstSurName + remainingSurName +" " + firstLastName + remainingLastName);
        }
        //Bai 20: Write a java program to print followings to console:
        private static void printConsole(){
            //Space format specifier
            System.out.printf("===== Space format specifier =====\n");
            System.out.printf("-%d\n", 111);
            System.out.printf("%2d | \n", 12);
            System.out.printf("%d\n", 111);
            System.out.printf("-%d\n", 222);
            System.out.printf("%d\n", 222);

            //+Sign Specifier
            System.out.printf("===== + Sign Specifier =====\n");
            System.out.printf("+%d\n", 111);
            System.out.printf("-%d\n", 111);

            //(specifier
            System.out.printf("===== ( specifier =====\n");
            System.out.printf("(%d)\n", 111);
            System.out.printf("%d\n", 111);

            //===== Comma, Specifier =====
            System.out.printf("===== Comma, Specifier =====\n");

            //===== Left Justification(-) Specifier =====
            System.out.printf("===== Left Justification(-) Specifier =====\n");
            System.out.printf("|%20.4f|\n", 1234.1234);
            System.out.printf("|%-20.4f|\n", 1234.1234);

            //===== Precision Formats =====
            System.out.printf("===== Precision Formats =====\n");
            System.out.printf("%e", 123.0000);
            System.out.printf("%.4f\n", 123.1235);
            System.out.printf("%.1f\n", 123.1);
            System.out.printf("%15s\n", "123456789012345");
            System.out.printf("%10s\n", "0000000088");

        }
}
