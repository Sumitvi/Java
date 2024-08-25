import java.util.PrimitiveIterator;

public class PrimeRange{


    public static boolean isPrime(int n){
       boolean isnumPrime= true;

       for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isnumPrime = false;
            
        }
       }
      return isnumPrime;
    }
    public static void Primeinrange(int n){
        

        for(int i =2 ; i<=n;i++){
            if(isPrime(i)){
                System.out.print( i + " ");
                
            }
            // System.out.println();
        }
    }

    public static void main(String args[]){

        Primeinrange(100); //Void Functions Only need Call they dont'nt need to print
    //    System.out.println(Primeinrange(5));

    }
}