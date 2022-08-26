package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    /*
    [IQ] Given a number n, print the output based on the following conditions:

   if the number is divisible by 3 print Fizz
   if the number is divisible by 5 print Buzz
   if the number is divisible by 3 and 5 print FizzBuzz
   if the number is not divisible by any then print just the number

   Ex:
        n = 10
        Buzz

        n = 12
        Fizz

        n = 13
        13

        n = 15
        Fizzbuzz
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number%3 == 0 && number%5 != 0){
            System.out.println("Fizz");
        }
        else if (number%5 == 0 && number%3 != 0){
            System.out.println("Buzz");
        }
        else if ( number%3 == 0 && number%5 == 0){
            System.out.println("FizzBuzz");
        }else {
            System.out.println(number);
        }
        /*
        boolean by3 = number%3 == 0 && number%5 != 0
        boolean by5 = number%5 == 0 && number%3 != 0
         */

    }
}
