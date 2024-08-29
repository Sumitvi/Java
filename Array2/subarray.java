public class subarray{


    public static void MaxSubArray(int numbers[]){


       
        int Max_sum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
           
           int  start=i;
           for(int j=i;j<numbers.length;j++){
                int CurrSum=0;
                int end = j;

                for(int k=start;k<=end;k++){
                    CurrSum = CurrSum + numbers[k];
                }
                    System.out.println("CurrSum is " + CurrSum);
               if(Max_sum<CurrSum){
                    Max_sum=CurrSum;
               }
           }
          
        }

        System.out.println(" Max Value of SubArray is " + Max_sum);

    }
    public static void main(String args[]){

        int numbers[] = {5,4,-1,7,8};
        MaxSubArray(numbers);
        
    }
}