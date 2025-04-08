public class primetoptimize {

    public static boolean Prime(int n){
        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;

            }
        }

        return isPrime;
    }
    public static void main(String[] args) {

        System.out.println(Prime(7));
        
    }
    
}
