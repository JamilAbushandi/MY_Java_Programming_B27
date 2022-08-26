package Practice;

import java.util.Scanner;

public class longestElementOfArray {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW
        int max = 0;
        String longestElement = "";
        for (int j = 0; j < words.length; j++) {
            if (words[j].length() > max) {
                max = words[j].length();
                longestElement = words[j];
            }
            System.out.println(longestElement);
        }
    }
}