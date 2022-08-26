package day1000_russian_practice;

import java.util.Arrays;

public class Arraymethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println("summary of array= " + summArray(arr));

        int[] arr1 = addNumberToArray(arr, 8);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = addNumberToArray(arr1, 8);
        System.out.println(Arrays.toString(arr2));

    }


    /*   Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */
    public static int summArray(int[] arr) {

        int summ = 0;
        for (int each : arr) {
            summ += each;
        }
        return summ;
    }


    /*   create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */
    public static int[] addNumberToArray(int[] arr, int num) {

        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = num;

        return newArray;
    }
}
