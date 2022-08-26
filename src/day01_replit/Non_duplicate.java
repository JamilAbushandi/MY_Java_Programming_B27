package day01_replit;

import java.util.Scanner;

public class Non_duplicate {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:
        System.out.println();
        System.out.println();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){

                System.out.println(nums[i]);
            }count = 0;

        }








    }
}
