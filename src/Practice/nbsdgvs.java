package Practice;

import java.util.Arrays;

public class nbsdgvs {

    public static void main(String[] args) {

        int[]num1 = {1,2,3,4};
        int[]num2 = num1;

        num2[0] = 10;
        num1[2] = 9;

        System.out.println(Arrays.toString(num1) +"\n" + Arrays.toString(num2));

    }

}
