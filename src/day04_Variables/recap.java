package day04_Variables;

public class recap {
    public static void main(String[] args) {

       // declare variables
       double temperature;
       byte numberOfJavaDays;
       short numberOfSoftSkillsDays;

       // assigning value to variables
       temperature = 74.2;
       numberOfJavaDays = 4;
       numberOfSoftSkillsDays = 2;

        System.out.println("temperature = " + temperature + " Celsius");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays + " Celsius");
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays + " Celsius");

        // declare and assign at same time
        int numberOfCoffeeCups = 2;
        float ratingOfMovie = 8.9F; // compiler takes 8.9 as double type, so we add F to the end to change it to float type
        long waterInOcean = 200_000_000_000_000L; // compiler takes 2000000000000 as int type, but the number is too big for int, so it doesn't compile, we need to add L at the end to make it long type

        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean + " Liters");




    }
}
