package day07_scanner;

public class shortCircuitEX {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
        //System.out.println(5/0);  you cannot divide by 0

       // System.out.println(true && 5/0 == 0);  --> cant run the code
        System.out.println(false && 5/0 ==0);

        System.out.println(false & 5/0 ==0); // doesnt run, cant understand single &

        /*
        && || vs & |
        && || the program will stop running if it knows the final answer
        & | the program will continue reading all the codes

         */



    }
}
