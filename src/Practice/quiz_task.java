package Practice;

import java.util.Arrays;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

public class quiz_task {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(extractNum("hihello^@)10hi")));

    }

    public static String [] extractNum(String s){
        String [] arr = new String[3];
        String a = "";
        String b = "";
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            if(isDigit(s.charAt(i))){
                a+= s.charAt(i);
            }
            else if(isAlphabetic(s.charAt(i))){
                b+= s.charAt(i);
            }
            else if(!isDigit(s.charAt(i)) && !isAlphabetic(s.charAt(i))){
                c+= s.charAt(i);
            }

        }
        arr[0]= a;
        arr[1]= b;
        arr[2]= c;
        return arr;
    }
}
