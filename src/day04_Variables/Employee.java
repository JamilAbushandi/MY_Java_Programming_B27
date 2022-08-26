package day04_Variables;

public class Employee {
    public static void main(String[] args) {

        String firstName = "Jamil";
        String lastName = "Abushandi";
        String companyName = "Cydeo";
        String jobTitle = "SDET";
        char suite = 'b';
        String employeeID = "245-1";
        String numberOfPTO = "2 weeks";
        int salary = 50_000;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + employeeID + "@" + companyName + ".com";
        String benefits = salary + ", " + numberOfPTO + " \"work from home\"";

        System.out.println("=============================\n\t\tEmployee #1337\n----------------------------\n" + "His name:\t" + fullName + "\nHe works at:\t" + companyName + "\nJob Title:\t" + jobTitle + "\nFull Time Employee:\t" + isFullTime + "\nSuite:\t" + suite + "\nEmployee ID:\t" + employeeID + "\nYearly income:\t$" + salary + "\nPaid Time Off Yearly:\t" + numberOfPTO + "\nEmployment Benefits:\t$" + benefits + "\nYou can reach him at his email:\t" + email + "\n==============================");






    }
}
