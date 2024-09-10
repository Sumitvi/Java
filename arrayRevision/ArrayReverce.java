public class ArrayReverce {


    public static void Reverce(int numbers[]){
        int start = 0, end = numbers.length-1;
        
        while(start<end){
           int temp = numbers[end];
           numbers[end] = numbers[start];
           numbers[start] = temp;

           start++;
           end--;


        }
    }

    public static void main(String args[]){
        int numbers[] ={2,4,12,16,18,20};

        Reverce(numbers);

        System.out.println("Reverce Number is are as follows ");

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }

    }
    
}
