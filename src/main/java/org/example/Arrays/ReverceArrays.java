package org.example.Arrays;

import java.util.Arrays;

public class ReverceArrays {

    public static void main(String args[]){
        int nums [] = {2, 3 ,4 ,5 ,6, 7};
        int start = 0, end = nums.length-1;

        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
