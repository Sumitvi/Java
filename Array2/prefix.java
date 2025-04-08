public class prefix {



    public static void PrefixSum(int numbers[]){
        int curr_sum =0;
        int max_sum = Integer.MIN_VALUE;
        int prefix [] = new int[numbers.length];

        for(int i=1;i<numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0;i<=numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                curr_sum =start==0 ? prefix[end] :  prefix[end] + prefix[start-1];
            }
           System.out.println("Cuurent Sum is " + curr_sum);


            if(max_sum<curr_sum){
                max_sum = curr_sum;
            }
        }

        System.out.println("Max Sum is " + max_sum);
     
    }


    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        PrefixSum(numbers);

    }
    
}
