package org.example.Arrays;

public class LargestNumInArr {

    public static void main(String args[]){

        int nums[] = {1,2,4,6,82,6};
        int largset = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>largset){
                largset = nums[i];
            }
        }
        System.out.println(largset);
    }
}
