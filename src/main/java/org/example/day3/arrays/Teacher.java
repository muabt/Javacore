package org.example.day3.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher {
    public static void main(String[] args){
        int[] numbers ={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = numbers.length;
        System.out.println("Before: " + Arrays.toString(numbers));
      /*  //V1: swap items util reach midpoint
        for (int i = 0; i < n/2; i++){
            //swap
            int temp = numbers[i];
            numbers[i] = numbers[n-i-1];
            numbers[n-i-1] = temp;

        }
        System.out.println("After: " + Arrays.toString(numbers));
        //V2: for
        for(int left = 0, right = n -1; left < right; left ++, right --){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
        }*/
        //V3: while
        int left = 0;
        int right = n-1;

        while (left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left ++;
            right--;

        }
        //V4: stream api
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("After: " + Arrays.toString(numbers));
    }
}
