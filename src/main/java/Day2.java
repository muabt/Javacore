import java.util.Scanner;

public class Day2 {
    public static void main( String[] args ) {

         //Bai 1: Write a Java program to calculate summary of all digits of number with 3 digits
        int sum =0;
        sum =(999+100)*900/2;
        System.out.println(sum);

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
