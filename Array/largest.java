import java.util.*;

public class largest {

    public static int getLarges(int numbers[]){
        int largest = Integer.MIN_VALUE ;//-infinity in java

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};


        System.out.println("Largest Number Is "+ getLarges(numbers));
        
    }
    
}
