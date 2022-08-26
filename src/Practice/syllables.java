package Practice;

import java.util.Scanner;

public class syllables {
    /*
    Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int counter = 1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {// //(i == word.indexOf('-')) {
                counter++;
            }
        }
        System.out.println(counter);
        }
    }

//hello-
//012345