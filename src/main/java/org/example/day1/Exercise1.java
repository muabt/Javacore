package org.example.day1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //tinhTong();
        //tinhSqrt();
        tongTien();
    }
        //Bai 1: Tinh S(n) = 1+2+3+...+n
        private static void tinhTong(){
            int n;
            long sum =0;
            Scanner sc;
            do{
                System.out.println("Input n = ");
                sc = new Scanner(System.in);
                n = sc.nextInt();
            }while (n<=0);
            for (int i=1; i<=n; i++){
                sum +=i;
            }
            System.out.println("Sum = " +sum);
            sc.close();

        }
        //Bai 33: Tinh can bac n cua 2
        private static void tinhSqrt(){
            int n;
            double sum =0;
            Scanner sc;
            do{
                System.out.println("Input n = ");
                sc = new Scanner(System.in);
                n = sc.nextInt();
            }while (n<=0);
            for (int i=1; i<=n; i++){
               sum = Math.sqrt(2 + sum);
            }
            System.out.println("Sum = " +sum);
            sc.close();
        }
        //Bai 110:Cần có tổng 200.000đ từ3 loại giấy bạc 1000đ, 2000đ, và 5000đ. Lập chương tình đểtìm tất cảcác phương án có thể.
        private static void tongTien(){
        int i, j, k, t;
        for (i =0; i <=200; i++)
            for (j =0; j <=100; j++)
                for (k=0; k <=40; k++)
                    t = i*1000 + j*2000 + k*5000;
                    if (t == 200000) {
                        System.out.println("Cac phuong an co the la: " + "so to 1000" + i + "so to 2000" + j + "so 5000" + k);
                    }

        }
}
