public class kadane {

    public static void KadaneAlgo(int nums[]){

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i=0;i<nums.length;i++){
            curr_sum = curr_sum + nums[i];

            if(curr_sum<0){
                curr_sum =0;


            }

            max_sum = Math.max(curr_sum, max_sum);
        }

        System.out.println("Max Sum is " + max_sum );

    }

    public static void main(String[] args) {

        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        KadaneAlgo(nums);
        
    }
    
}
