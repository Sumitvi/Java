package org.example.Arrays;

public class BinarySearch {

    public static int bSearch(int [] nums, int key){
        int start = 0 , end = nums.length -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==key){
                return mid;
            } else if (nums[mid]>key) {
                end = mid -1;


            } else if (nums[mid]<key) {

                start = mid + 1;

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,7,8,9,};
        int key = 8;

        int val = bSearch(nums, key);
        if(val == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at Index " + val);
        }

    }
}


//Time Complexity ---> O(log n )