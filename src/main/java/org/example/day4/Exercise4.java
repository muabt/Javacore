package org.example.day4;

import java.util.Scanner;

public class Exercise4 {
        public static void main(String[] args) {
           // DayofMonth();
           // DisplayWeekday();
           // displayRightTriangle();
           // displayRightTriangle2();
           // reverseNumber();
            PascalTriangle();

              }
        //Bai 4: Write a Java program to find the number of days in each month of a given year.

        private static void DayofMonth(){
            int month, year;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao so nam muon kiem tra: ");
            year = sc.nextInt();
            System.out.println("Nhap vao so thang muon kiem tra: ");
            month = sc.nextInt();
            if ((month ==2) && ((year%4==0) || ((year%100==0) && (year%400==0))))
                System.out.println("So ngay la 29");
            else if (month==2)
                System.out.println("So ngay la 28");
            else if (month==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12)
                System.out.println("So ngay la 31");
            else
                System.out.println("So ngay la 30");


        }
        //Bai 13: Write a Java program that keeps a number between 1 and 7 from the user and displays the name of the weekday.
            private static void DisplayWeekday() {
                int day;
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap vao so ngay:");
                day = sc.nextInt();
                System.out.println(getDayName(day));

            }

            public static String getDayName (int day){
                    String dayName ="";

            switch (day){
                case 1: dayName = "Monday"; break;
                case 2: dayName = "Tuesday"; break;
                case 3: dayName = "Wednesday"; break;
                case 4: dayName = "Thursday"; break;
                case 5: dayName = "Friday"; break;
                case 6: dayName = "Saturday"; break;
                case 7: dayName = "Sunday"; break;
                default:dayName = "Invalid day range";

            }
            return dayName;
            }

            //Bai 14: Write a program in Java to display the pattern like right angle triangle with a number like:
            private static void displayRightTriangle() {
                int i, j, n;
                System.out.println("Nhap so dong: ");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                for (i = 1; i <= n; i++){
                    for (j = 1; j <= i; j++)
                        System.out.print(j);
                    System.out.print("\n");
                }
            }

            //Bai 15: Write a program in Java to make such a pattern like right angle triangle with number increased by 1
            private static void displayRightTriangle2(){
                int i, j, n, t=1;
                System.out.println("Nhap so dong: ");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                for (i = 1; i <= n; i++){
                    for (j = 1; j <= i; j++)
                        System.out.print(t++);
                    System.out.print("\n");
                }
            }

            //Bai 16: Write a program in Java to reverse a number
            private static void reverseNumber(){
            int number = 0, reverse = 0;
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            while (number!=0){
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;

            }
            System.out.println("Số đảo ngược là: " + reverse);
            }

            //Bai 17: Write a Java program to display Pascal's triangle
            private static void PascalTriangle(){
            int i, j, row, block, c=1;
            System.out.println("Nhap vao so dong muon hien thi: ");
            Scanner sc = new Scanner(System.in);
            row = sc.nextInt();
                for (i = 0; i < row; i++)
                {
                 for (block = 1; block <= row - i; block ++)
                     System.out.print(" ");
                    for (j=0; j<=i; j++)
                    {
                        if (j==0 || i==0)
                            c=1;
                            else
                                c = c*(i-j+1)/j;
                            System.out.print(" " +c);

                    }
                    System.out.print("\n");

                }
            }
            //Bai 18: Write Java program to check if string with parenthesis/brackets is matching or not




}
