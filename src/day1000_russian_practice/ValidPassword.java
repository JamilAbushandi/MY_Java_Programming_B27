package day1000_russian_practice;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        
    /*
                Given a String password find out if it is a valid password

                Requirements:
                    Must have at least 8 characters
                    Must have at least 1 uppercase letter               - count
                    Must have at least 1 lowercase letter               - count
                    Must have at least 1 number                         - count
                    Must have one of the follow special characters:     - count
                        ! @ # $ % ^ & *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = input.next();

        if (isValidPasswordDetail(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }

    }

    public static boolean isValidPassword(String passw) {

        int countLower = 0, countUpper = 0, countNum = 0, countSpecial = 0;
        for (int i = 0; i < passw.length(); i++) {
            if (Character.isLowerCase(passw.charAt(i))) {
                countLower++;
            } else if (Character.isUpperCase(passw.charAt(i))) {
                countUpper++;
            } else if (Character.isDigit(passw.charAt(i))) {
                countNum++;
            } else {
                countSpecial++;
            }
        }
        return passw.length() >= 8 && countLower >= 1 && countUpper >= 1 && countNum >= 1 && countSpecial >= 1;
    }

        public static boolean isValidPasswordDetail(String passw) {

        int countLower = 0, countUpper = 0, countNum = 0, countSpecial = 0;
        for (int i = 0; i < passw.length(); i++) {
            if (Character.isLowerCase(passw.charAt(i))) {
                countLower++;
            } else if (Character.isUpperCase(passw.charAt(i))) {
                countUpper++;
            } else if (Character.isDigit(passw.charAt(i))) {
                countNum++;
            } else {
                countSpecial++;
            }
        }

        String mess = "";
        if (passw.length() < 8) {
            mess += "Password length must be more then 8 characters.\n";
        }
        if (countLower == 0) {
            mess += "Password has to contain at least one lowercase\n";
        }
        if (countUpper == 0) {
            mess += "Password has to contain at least one uppercase\n";
        }
        if (countNum == 0) {
            mess += "Password has to contain at least one digit\n";
        }
        if (countSpecial == 0) {
            mess += "Password has to contain at least one special character";
        }

        System.out.println(mess);

        return passw.length() >= 8 && countLower >= 1 && countUpper >= 1 && countNum >= 1 && countSpecial >= 1;
    }

}