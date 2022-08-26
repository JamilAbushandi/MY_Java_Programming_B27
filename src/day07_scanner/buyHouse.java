package day07_scanner;

public class buyHouse {
    public static void main(String[] args) {

        int creditScore = 720;
        int salary = 100_000;

        boolean option1 = creditScore >= 720 && salary >= 100_000;
        boolean option2 = creditScore >= 740 && salary >= 80_000;
        boolean canGetLoan = option1 || option2;

        System.out.println("can get Loan = " + canGetLoan);

    }
}
