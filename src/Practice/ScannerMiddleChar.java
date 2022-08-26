package Practice;

import java.util.Scanner;

public class ScannerMiddleChar {
    public static void main(String[] args) {
        /*
        [Middle char]

Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
         */
    // asma   4
    // 0123   sm
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word1 = input.nextLine();



            if (word1.length() % 2 == 0) {
                System.out.println(word1.substring(word1.length() / 2 - 1, word1.length() / 2 + 1));
            } else if (word1.length() % 2 != 0) {
                System.out.println(word1.substring(word1.length() / 2, word1.length() / 2 + 1));
            }




    }
}
