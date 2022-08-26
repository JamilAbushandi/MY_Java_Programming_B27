package Practice;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;


public class interviewTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
         //0123456789012345678901234567890123456   37-1 =      36 - (37-21-2) == 11
        //"Thereare500mangoeson30treesin5gardens" ---> output needs to be 535!
        String digits = "";
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < input1.length() -1 ; i++) {

            if (isDigit(input1.charAt(i))) {
                digits = digits + input1.charAt(i);

                if (!isDigit(input1.charAt(i+1)  )){
                    //                        37-1 = 36    -      (  35            -      21      )
                  //  System.out.println(input1.length()-1 - ((input1.length()-2) - input1.indexOf(i)));
                    sum += parseInt(digits);
                    digits = "";

//                    (input1.substring(input1.length()-2)
                }
            }
        }
        for (int j = input1.length()-1; j > 0 ; j--) {
           if(isDigit(input1.charAt(j))){
               counter++;
               if (!isDigit(input1.charAt(j-1))){
                   break;
           }
        }
        System.out.println(sum + parseInt(input1.substring(input1.length()-counter)));
    }
}}