import java.util.Scanner;

public class Day2 {
    public static void main( String[] args ) {

         //Bai 1: Write a Java program to calculate summary of all digits of number with 3 digits
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        int num = sc.nextInt();
        int digit;
        int sum = 0;
        int count = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            sum += digit;
            count += 1;

        }
        System.out.println(sum);
        System.out.println(count);

        //Bai 2: Write a Java program to convert temperature from Fahrenheit to Celsius degree and vice-versa (Celsius/5 = (Fahrenheit -32) / 9
        double doC=0;
        double doF=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do C:");
        doC = scanner.nextDouble();
        doF = (doC*9/5)+32;
        System.out.println("Quy doi sang do F la:" +doF);
        System.out.println("Nhap vao do F:");
        doF = scanner.nextDouble();
        doC =(doF-32)/9*5;
        System.out.println("Quy doi san do C la:" +doC);

    }
}
