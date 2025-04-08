package org.example.Arrays;

import java.util.Arrays;

public class TwoSum {


    public static int[] tSum(int[] nums, int target){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){
                    int a[] = {i , j};
                    return a;
                }
            }
        }

        return null;
    }

//    Brute Force Approach

    public static void main(String[] args) {

        int nums[] = {1, 3 , 5 ,6 , 8 ,5 ,4};
        int target = 10;
        int[] result = tSum(nums, target);

        if(result!=null){
            System.out.println(Arrays.toString(result));
        }else{
            System.out.println("Not Found");
        }


    }
}
