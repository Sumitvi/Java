import java.util.Scanner;

public class BionomialCofficient {

    public static int Factorial(int i){
        if(i<=1){
            return 1;
        }else{
            int fact = i*Factorial(i-1);
            return fact;
        }
    }

public static int Bionomial(int n , int r){
    int nfact = Factorial(n);
    int rfact = Factorial(r);
    int nmrfact = Factorial(n-r);

    int result = nfact/(rfact*nmrfact);

    return result;


}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        System.out.println("Enter r ");
        int r = sc.nextInt();

      int nCr = Bionomial(n,r);
       System.out.println("The Bionomial Cofficient is " + nCr);
        
    }
    
}
