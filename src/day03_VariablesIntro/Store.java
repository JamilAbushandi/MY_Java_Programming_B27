package day03_VariablesIntro;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store"); // combines "concatenates" the value of the number of items variables with the characters in the store

        numberOfItems = 700; //reassigned variable to 700
        System.out.println(numberOfItems + " after the sale");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); //soutv

        double totalCost = 1_000_000.99; //1,000,000.99 ---> how we might want to write it, but comas are not valid in syntax, so we can use underscore in numbers, to improve readability
        System.out.println( totalCost);

        float f = 19.99f; // put f/F will tell the compiler this is a float number, not a double number

        float f2 = 100; // 100 is int type by default, and int is smaller than float, so there is no problem here
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 100; valid if i wanted
        // float f2 = 100F;
        // float f2 = 100.99F;

        long population = 8_000_000_000L; //adding l/L to the number will change the type from int(the default) to long type, because the number is too big to be held in an int type
        System.out.println(population);

        long population2 = 1_000_000; //L is not needed because 1 million is a valid number for int types, and that type can automatically be converted to a bigger type



    }
}
