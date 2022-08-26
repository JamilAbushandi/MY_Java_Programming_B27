package day1000_russian_practice;

import java.util.Scanner;

public class HTMLGenerator {
    public static void main(String[] args) {
        /*  HTML Generator

            Given a String in the following format take the number part of the generator the html tags.
                Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^
                Ex:
                    Input:
                        div-2
                    Output:
                        <div></div>             <div></div>
                Ex:
                    Input:
                        li-3
                    Output:
                        <li></li>       <li></li>        <li></li>
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Input tags info: ");
        String str = input.next();

        String [] arr = str.split("-");             // input:       tag-4        {"tag", "4"}  String

        String tag = arr[0];
        int num = Integer.parseInt(arr[1]);              //  num = 4

        String output = "";

        for (int i = 0; i < num; i++) {
            output += "<" + tag +">" +  "</" + tag +">";        //  <tag>     </tag>
        }

        System.out.println(output);
    }
}

