package day01_replit;

import java.util.Scanner;

public class catdog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        int count = 0;
        for(int i = 0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals(""+str.charAt(i)+str.charAt(i)+str.charAt(i))){
                count++;
            }
        }System.out.println(count);

//        int cat = 0;
//        int dog = 0;
//
//        String dogStr = str;
//        String catStr =str ;
//
//
//        for(int i = 0; i < str.length(); i++){
//
//            if(dogStr.contains("dog")){
//                dogStr = dogStr.substring(dogStr.indexOf("dog")+1);
//                dog++;
//            }
//            if(catStr.contains("cat")){
//                catStr = catStr.substring(catStr.indexOf("cat")+1);
//                cat++;
//            }
//
//
//
//        }
//        boolean result = cat==dog;
//        System.out.println(result);


    }
}
