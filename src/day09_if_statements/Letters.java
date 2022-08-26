package day09_if_statements;

public class Letters {
    public static void main(String[] args) {

        char letter = 'B';

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is uppercase letter");
        }

        /*
        if (letter >= 65 && letter <= 90){
         */

        if (letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is lowercase letter");
        }
        /*
        if(letter >= 97 && letter <= 122){
        */


    }
}
