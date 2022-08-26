package day06_operators;

public class NOTpractice {
    public static void main(String[] args) {

       int age = 22;
       boolean isUnderage = true;
       boolean hasID = true;

       boolean isEligible = age >= 21 && isUnderage && hasID;

       System.out.println("isEligible = " + isEligible);


    }
}
