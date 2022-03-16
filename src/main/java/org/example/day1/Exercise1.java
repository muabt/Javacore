package org.example.day1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //tinhTong();
        //tinhSqrt();
        //tongTien();
        tongTienMax();
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
        private static void tongTien() {
        //dung while
           /* int i, j, k, count;
            i = j = k = count = 0;
            while (i <= 200) {
                while (j <= 100) {
                    while (k <= 40) {
                        if ((i + 2 * j + 5 * k) == 200) {
                            count++;
                            System.out.printf("%d to 1000, %d to 2000, %d to 5000 \n", i, j, k);

                        }
                        k++;
                    }
                    k = 0;
                    j++;
                }
                j =0;
                i++;
            }
            System.out.printf("Tong truong hop dung la %d \n", count);*/
            //dung for
            int count = 0;
            for (int i =0; i <= 200; i++){
                for (int j =0; j <=100; j++){
                    for (int k =0; k <= 40; k++){
                        if ((i + j*2 + k*5) == 200){
                            count++;
                            System.out.printf("%d to 1000, %d to 2000, %d to 5000 \n", i, j, k);

                        }
                    }
                }
            }
            System.out.printf("Tong truong hop dung la %d \n", count);
        }

        //Mở rộng: Hãy tìm trường hợp có tổng số tờ tiền là lớn nhất hoặc bé nhất (yêu cầu có cả 3 mệnh giá)

        private static void tongTienMax() {
            int count = 0;
            // Số lượng lớn nhất của mỗi mệnh giá
            int iMax = 0, jMax = 0, kMax = 0;
            // Tổng max
            int max = 0;
            for(int i = 0; i <= 200; i++){
                for(int j = 0; j<=100; j++){
                    for(int k=0; k<=40; k++ ){
                        if((i + 2 * j + 5 * k) == 200){
                            if(i >= 1 && j >= 1 && k >= 1){
                                if(max < (i + j + k)){
                                    max = i + j + k;
                                    iMax = i;
                                    jMax = j;
                                    kMax = k;
                                }
                            }
                            count ++;
                            System.out.printf("%d to 1000, %d to 2000, %d to 5000 \n",i, j, k);
                        }
                    }
                }
            }
            System.out.printf("Tổng trường hợp đúng là %d \n", count);
            System.out.printf("Trường hợp có tổng số tờ tiền cao nhất là %d, %d 1000 VND, %d 2000 VND, %d 5000 VND",max, iMax,jMax, kMax);
        }


}
