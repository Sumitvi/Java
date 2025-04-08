package org.example.Arrays;

import java.util.Arrays;

public class SecondLargsetElementArr {

    public static void main(String[] args) {
        int nums[] = {12, 35, 1, 10, 34, 1};
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = n-2; i>=0 ;i--) {
            if(nums[i]!=nums[n-1]){
                System.out.println(nums[i]);
                break;
            }

        }

        System.out.println("Not Found");

    }
}
