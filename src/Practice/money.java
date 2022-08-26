package Practice;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        /*
        Possible algorithm for seconds convertor

Use a combination of division and remainder

the program gets seconds as an input

determine how many seconds are in an hour. Use this to find out how many hours were given, then take the hours counted out to determine the seconds left

then determine how many seconds are in a minute and find out how many minutes are given. Then take the minutes out of the total seconds left

you will also be left with seconds


This is one possible solution. Try to write code to do these steps. I will share some sample solution later this week
 */





        Scanner a = new Scanner(System.in);
        int time = a.nextInt();

        int hours = time / 3600;
        time = time % 3600;     //time %= 3600;  time = time % 3600
        int minutes = time / 60;
        time = time % 60;       //time %= 60;
        int seconds = time;

        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);

        /*Scanner a = new Scanner(System.in);
        int time = a.nextInt();
        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 3600 % 60;


        System.out.println("hours: " + hours);
        System.out.println("minutes: " + minutes);
        System.out.println("seconds: " + seconds);






        /*
        Scanner a = new Scanner(System.in);
        int money = a.nextInt();
        int quarters = money / 25;
        money = money % 25;
        int dimes = money / 10;
        money = money % 10;
        int nickles = money / 5;
        money = money % 5;
        int pennies = money;
         */
      /*
        System.out.println("Quarter: " + quarters);
        System.out.println("Dimes = " + dimes);
        System.out.println("Nickles = " + nickles);
        System.out.println("Pennies = " + pennies);
        // money %=25; ---> money = money % 25;

         */
    }
}
