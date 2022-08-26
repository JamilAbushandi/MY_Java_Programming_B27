package Practice;

public class adada {
    // reverse the string
    public static String reverseString (String str) {           // NonVoidMethods.reverseString("String");

        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i-- ) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }


    public static int len (String str) {

        int i = 0;
        for (int j = 0; j < str.length(); j++ ) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        String ad = "dadadadadadada";
        System.out.println(len(ad));
        System.out.println(ad.length());
    }
}

