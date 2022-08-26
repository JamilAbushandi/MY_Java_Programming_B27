package Practice;

public class practiceee {
/*
create a method that will accept a String and find if it is Palindrome or not
 */

    public static void main(String[] args) {
                                                //0123456
        System.out.println(isOrIsntPalindrome("RAceCar"));
        System.out.println(isOrIsntPalindrome("hello"));

    }

    public static boolean isOrIsntPalindrome(String str){ // anna

        String reverseStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i); // reverseStr += str.charAt(i);
        }
        return (reverseStr.equalsIgnoreCase(str));
    }




}

