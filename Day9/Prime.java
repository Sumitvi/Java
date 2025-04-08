public class Prime {

    public static boolean Prime(int n){

        // Corner Case

        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
                
            }
        }

        return isPrime;
    }
    public static void main(String args[]){

        System.out.println(Prime(8));

    }
    
}
