package day15_string;

import jdk.swing.interop.SwingInterOpUtils;

public class Email {
    public static void main(String[] args) {

        String email = "jamil.daotra@yahoo.com";

        int indexOfAT = email.indexOf('@');
        String name = email.substring(0, indexOfAT);
        int indexOfSecondDot = email.indexOf('.', indexOfAT);
        String domain = email.substring(indexOfAT + 1, indexOfSecondDot);
        String afterSecondDot = email.substring(indexOfSecondDot + 1);

        System.out.println("Full email: " + email);
        System.out.println("Name part: " + name);
        System.out.println("Domain part: " + domain);
        System.out.println("DNS: " + afterSecondDot);


    }
}
