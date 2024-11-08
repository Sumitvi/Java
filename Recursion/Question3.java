public class Question3 {

    public static int PrintFact(int n){

        if(n==0){
            return 1;
        }

        return n * PrintFact(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(PrintFact(n));
        
    }
    
}
