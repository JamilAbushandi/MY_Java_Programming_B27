package day1000_russian_practice;

public class methodPalindrome {

    //create a method that will accept a String and find if its palindrome or not (boolean)

    public static void main(String[] args) {

        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("RaceCaR"));

      //  System.out.println(isPalindromeVOID("anna"));
     //   System.out.println(isPalindromeVOID());

    }

    public static boolean isPalindrome(String str){
       String reverseStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr += str.charAt(i);
        }
        if(reverseStr.equalsIgnoreCase(str))
            return true;
        else{
            return false;
        }
    }

    public static void isPalindromeVOID(String str){
        String reverseStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr.equalsIgnoreCase(str));
    }


}
