package org.example.day4;
import java.util.Scanner;

public class control_flows {
    //income =120_000
    //hasHighIncome >= 100 000
    public static void main(String[] args) {
        int income = 120_000;
        //cach 1
        /*boolean hasHighIncome = false;
        if (income > 100_000) {
            hasHighIncome = true;
        }*/
        //cach 2
        boolean hasHighIncome = income > 100_000;
        System.out.println(hasHighIncome);
        String className;
        if (income < 100_000)
            className = "First";
        else
            className = "Second";
        //Ternary operator
        String className2 = income > 100_000 ? "First" : "Second";



    }


}
