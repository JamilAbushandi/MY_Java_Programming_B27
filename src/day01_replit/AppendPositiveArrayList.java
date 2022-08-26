package day01_replit;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPositiveArrayList {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        int counter = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0; i<list.size(); i++){
            if(list.get(i)>0){
                a.add(list.get(i));
                counter += list.get(i);
            }
        }
        a.add(counter);

        return a;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
