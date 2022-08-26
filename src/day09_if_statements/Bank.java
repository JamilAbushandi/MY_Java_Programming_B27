package day09_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountToWithdraw = 500_000;

        balance -= amountToWithdraw; // balance = balance - amountToWithdraw;
        System.out.println("withdrew: " + amountToWithdraw);

        if (balance >= 0){
            System.out.println("current balance is: " + balance);
        }

        if (balance < 0){
            System.out.println("overdraft penalty");
            System.out.println("Amount due: " + amountToWithdraw * .25);
        }




    }
}
