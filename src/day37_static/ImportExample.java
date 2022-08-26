package day37_static;


import java.util.Arrays;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;

import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*; // access all static members from this class without the class name
import static java.util.Arrays.sort;


public class ImportExample {
    public static void main(String[] args) {


        System.out.println(Math.PI);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

        System.out.println(PI);
        //System.out.println(max(4,6)); // method: Math.max() --> need to define the class
        System.out.println(abs(-1)); // Math.abs()

        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
        parseInt(""); // Integer.parseInt();

        int [] a = {43, 4, 2};
        System.out.println(Arrays.toString(a));
        sort(a);
    }
}
