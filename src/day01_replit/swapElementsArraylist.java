package day01_replit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swapElementsArraylist {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        //ArrayList<String> a = new ArrayList<>();
        Collections.swap(list,pos1,pos2);

        return list;

    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount of words");
        int size = in.nextInt();
        System.out.println("enter pos1");
        int pos1 = in.nextInt();
        System.out.println("enter pos2");
        int pos2 = in.nextInt();
        System.out.println("enter the words");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

    }

}
