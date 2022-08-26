package day01_replit;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        //012345678901234567890123456789012
        //hello there how is everyone today
        String result = "";
        for(int i=0; i<str.length();i++){
            if(!result.contains(""+str.charAt(i))){
                result+= str.charAt(i);
            }
        }
        return result;
    }
}
