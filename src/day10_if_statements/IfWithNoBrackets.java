package day10_if_statements;

import java.sql.SQLOutput;

public class IfWithNoBrackets {
    public static void main(String[] args) {

        if(3 < 9){
            System.out.println("First");
            System.out.println("Second");
        }

        if(3 > 9)
            System.out.println("Third"); // this is the line executed when the if statement is true

        System.out.println("Fourth"); // this is not a part of the if statement

        System.out.println("----------------------");

        if(4 % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

        System.out.println("----------------------");
        char a = 'a';

        if(a == 'u')
            System.out.println("letter a");
        else if(a == 'b')
            System.out.println("letter b");
        else if (a == 'c')
            System.out.println("letter c");
        else
            System.out.println("other");

    }
}
