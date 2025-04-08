import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;


        // if(n%2==0){

        //     System.out.println("number is prime");
        // }else{



            
        // }

        for(int i =2;i<=n-1;i++){
            if(n % i==0){
                isPrime = false;
            }


            
        }

        if(isPrime == true){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }


        
    }
    
}
