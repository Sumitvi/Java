import java.util.*;;
public class LargestValue {


    public static int largest(int numbers[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
        if(largest<numbers[i]){
            largest=numbers[i];
        }
        }

        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,18};

        int largestNum= largest(numbers);
        System.out.println("Largest Number Is " + largestNum);
    }
    
}
