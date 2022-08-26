package day1000_russian_practice;

import java.util.Arrays;

public class ArraysOfInteger {


        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println("summary of array= " + summArray(arr));

            int[] arr1 = addNumberToArray(arr, 8);
            System.out.println(Arrays.toString(arr1));

            int[] arr2 = addNumberToArray(arr1, 8);
            System.out.println(Arrays.toString(arr2));
            System.out.println(minNumber(arr2));
            System.out.println(maxNumber(arr1));
            System.out.println(isContain(arr2, 10));
            System.out.println(isContain(arr2, 5));
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

    /* create a method that will accept an int array and return the smallest number from the array
     */
    public static int minNumber(int[] arr) {

        int min = 100000000;

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    /*create a method that will accept an int array and return the biggest number from the array */
    public static int maxNumber(int[] arr) {

        int max = -100000000;

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    /*  create a method that will accept an int array and an int number. Check and return if the given number is in the array. */
    public static boolean isContain(int[] arr, int num) {

        for (int each : arr) {
            if (num == each) {
                return true;
            }
        }
        return false;
    }

}


