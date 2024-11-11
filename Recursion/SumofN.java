public class SumofN {

    public static int PrintSumn(int n){
        if(n==1){
            return 1;
        }

        return n + PrintSumn(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(PrintSumn(n));

    }
    
}
