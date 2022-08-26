package day06_operators;

public class logicalOperators {
    public static void main(String[] args) {

        // && means AND
        // || means OR
        // ! means NOT

        boolean isWeekend = true;
        boolean isGoodTemp = false;
        boolean doBBQ = isWeekend && isGoodTemp; // && and both need to be true for true result
        /*
            this is not necessary
            isWeekend == && isGoodTemp == ture;
         */
        System.out.println("Do BBQ: " + doBBQ);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter = false;
        boolean getDiscount = isTeacher || isPolice || isFireFighter; // || or only one of the boolean needs to be true for the result to be true

        System.out.println("get discount: " + getDiscount);

        // goal: 5 < number < 10
        int number = 7;
        System.out.println(number > 5 && number < 10); // true && true --> true
        System.out.println(number > 0 && number < 5); // true && false --> false

        int age = 40;
        boolean inValidAge = age < 0 || age > 120; // false || false --> false


    }
}
