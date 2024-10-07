import java.util.Arrays;
import java.util.Collections;
public class Inbuilt {



    public static void main(String[] args) {

       Integer arr[] = {5,3,1,6,2};
        // Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        
    }
    
}
