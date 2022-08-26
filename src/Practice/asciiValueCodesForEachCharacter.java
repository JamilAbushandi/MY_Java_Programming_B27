package Practice;

import java.util.Scanner;

public class asciiValueCodesForEachCharacter {
    /*
    Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your word:");
        String word = input.nextLine();
        int intOfIndex = 0;
        char index = ' ';

        for (int i = 0; i < word.length(); i++) {
            index = word.charAt(i);
            intOfIndex = (int)index;
            System.out.print(intOfIndex + " ");
        }
    }
}
