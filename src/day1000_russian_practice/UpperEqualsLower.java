package day1000_russian_practice;

public class UpperEqualsLower {
     /*   Write program that returns true if the total number of uppercase
            characters are equal to total number of lowercase characters of a string
            Ex:
                str = "JAVA java";
            output:
                true
     */

    public static void main(String[] args) {

        String str = "JAVA   567567   java";

        int countLover = 0, countUpper = 0;

        for (int i = 0; i < str.length(); i++) {

            if  (Character.isLowerCase(str.charAt(i))) {
                countLover ++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                countUpper ++;
            }
        }

        System.out.println(countLover == countUpper);
    }
}
