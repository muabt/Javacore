package org.example.day5;

import java.util.Date;

public class StringFormat {
    public static void main (String[] args){

        //examples
        System.out.printf("Integer: %d\n", 20);

        //Integers
        System.out.printf("%d\n", 123);
        System.out.printf("%6d\n", 123);
        System.out.printf("%-6d\n", 123);
        System.out.printf("%06d\n", 123);

        //Floats
        System.out.printf("%f\n", 10.12344665);
        System.out.printf("%15f\n", 10.12344665);
        System.out.printf("%.8f\n", 10.12344665);
        System.out.printf("%9.4f\n", 10.12344665);
        System.out.printf("%.4f\n", 10.12344665);

        //String
        System.out.printf("%s \n", " Java String Formatting");
        System.out.printf("%30s \n", " Java String Formatting");
        System.out.printf("%-30s \n", " Java String Formatting");
        System.out.printf("%.15s \n", " Java String Formatting");

        //other examples
        //Integer: 20
        //Float: 10.123
        //String: OMG; Integer: 20; Float 10.12345
        System.out.printf("Float: %.3f\n", 10.123456);
        System.out.printf("String: %s; Integer: %d; Float: %.5f\n", "OMG", 20, 10.123456789);

        //Date, time
        System.out.printf("Current time - %tT\n", new Date());
        System.out.printf("Timestamp - %tc\n", new Date());
        String longDate = String.format("Today is %tA %<tB %<td, %<tY", new Date());
        System.out.println(longDate);

        //index
        System.out.printf("%3$10s %2$10s %1$10s", "Group", "Mount", "One");


    }

}
