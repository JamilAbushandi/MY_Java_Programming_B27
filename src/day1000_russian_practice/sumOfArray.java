package day1000_russian_practice;

import java.util.Arrays;

public class sumOfArray {

    // create a method that accepts an int array. Take the sum of all numbers and return the sum.

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("summary of array = " + sumArray(arr));

    }

    public static int sumArray(int[] arr){
        
        int sum= 0;
        for (int each: arr) {
            sum += each;
        }
        return sum;
    }




}
