package Practice;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        if ( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println("Letter");
        }
        if (ch <= '9' || ch >= '9') {
            System.out.println("Number");
        }
        if ( !(((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) || ((ch >= '0' && ch <= '9') ))){
            System.out.println("Special Character");
        }






    }
}
