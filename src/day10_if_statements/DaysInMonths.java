package day10_if_statements;
import java.util.Scanner;
public class DaysInMonths {
    /*
    create an int variable to represent the month number, where 1 is January and 12 is December.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
	Months that has 30 days: 4, 6, 9, 11
	Month that has 28 days: 2

	ex:
		12
		31 days

	ex:
		9
		30 days
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number from 1-12");
        int month = input.nextInt();
        int days = 0;
        String message = " ";

        boolean has31 = month == 1 || month == 3 || month == 5 || month ==7 || month == 8 || month == 10 || month == 12;
        boolean has30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has2 = month == 2;
        if (has31){
            days = 31;
        }
        else if (has30){
            days = 30;
        }
        else if (has2){
            days = 28;
        }

        if (has31){
            System.out.println("This month has " + days + " days");
        }
        else if (has30){
            System.out.println("This month has " + days + " days");
        }
        else if (has2){
            System.out.println("This month has " + days + " days");
        }
        else {
            System.out.println("This is an invalid month:\n-> please enter 1-12 <-");
        }




}
}

