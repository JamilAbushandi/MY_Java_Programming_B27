package day01_replit;

import java.util.Scanner;

public class firstAndLastCharOfWords {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //WRITE YOUR CODE BELOW:
        for (int i = 0; i<words.length; i++){
            System.out.println(""+ words[i].charAt(0) + words[i].charAt(words[i].length()-1));
        }
    }
}
