package day06_operators;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("get coffee");
        System.out.println("items in the cart: " + ++numberOfItems);
        price += 3.95; // price = price + 3.95

        System.out.println("get milk");
        System.out.println("add 1 gallon of milk " + ++numberOfItems);
        System.out.println("add 1 gallon of milk " + ++numberOfItems);
        price += 5.99; //price = price + 5.99

        System.out.println("Your total is $" + price);



    }
}
