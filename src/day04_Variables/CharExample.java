package day04_Variables;

public class CharExample {
    public static void main(String[] args) {

        char upper = 'P';
        char lower = 'e';
        char space = ' ';
        char number = '3';
        char special = '#';

        //soutv
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("space = " + space);
        System.out.println("number = " + number);
        System.out.println("special = " + special);

        char first = 65; // works just fine as long as it is not inside '  ' because it knows that 65 = A
        System.out.println("first = " + first);
        char second = 66; // another way to use it would be ---> char second = 'B';
        System.out.println("second = " + second);




    }
}
