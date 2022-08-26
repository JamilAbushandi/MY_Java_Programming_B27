package day19_loops;

public class Palindrome {
    /*
    given a String determine if it is Palindrome
    Palindrome means the String is read the same forwards and backwards

    ex:
        anna / racecar / maam / abcba
     */

    public static void main(String[] args) {

        String wordForward = "maam" ;
        String wordReverse = "";

        for(int index = wordForward.length()-1; index >= 0; index--)  {

            wordReverse = wordReverse + wordForward.charAt(index);
        }
             if(wordForward.equals(wordReverse))
                 System.out.println("Palindrome");
             else
                 System.out.println("Not Palindrome");

    }
}
