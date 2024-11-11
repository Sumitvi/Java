public class Question4 {

    public static int PrintFact(int n){

        if(n==1){
            return 1;
        }

        return n + PrintFact(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(PrintFact(n));
        
    }
    
}
