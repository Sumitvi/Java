package org.example.Arrays;

public class MinNumberInArr {
    public static void main(String[] args) {

        int nums[] = {2,4,6,1,4,7,9};
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }

        System.out.println(min);
    }
}
