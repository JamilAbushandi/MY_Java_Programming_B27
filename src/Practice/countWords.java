package Practice;

import java.util.Scanner;

public class countWords {
    /*
    Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your sentence");
        String sentence = input.nextLine();
        int wordsCounter = 0;
        for (int i = 0; i<sentence.length();i++ ){
            if(sentence.charAt(i) == ' '){
                wordsCounter++;

            }
        }
        System.out.println(wordsCounter+1);
    }
}
