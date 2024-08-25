import java.util.Scanner;

public class Approach {


    public static int computeSum(int num){
        int sum =0;

       while(num!=0){
        int lastDigit = num % 10;
        sum = sum + lastDigit;
        num = num/10;
       }
       return sum;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = computeSum(num);

        System.out.println("Sum of the Number is " + result);
      

    }
    
}
