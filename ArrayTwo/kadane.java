import java.util.*;
public class kadane{


    public static void MaxSubArr(int nums[]){
        int curr_Sum = 0;
        int max_sum =Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
           
            curr_Sum = curr_Sum + nums[i];

            if(curr_Sum<0){
                curr_Sum = 0;
            }

            max_sum = Math.max(curr_Sum,max_sum);
        }


        System.out.println("Maximum Subarray Sum Is " + max_sum);
    }
    public static void main(String args[]){
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};

        MaxSubArr(nums);

    }
}