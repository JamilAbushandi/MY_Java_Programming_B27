package Practice;

import java.util.Scanner;

public class removeDuplicates {
    /*Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String duplicate = "";
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                counter++;
                duplicate = "" +word.charAt(i);
            }if(counter >= 2) {
                duplicate = "" + word.charAt(i);
                System.out.println(duplicate);
            }
        }

    }
}
