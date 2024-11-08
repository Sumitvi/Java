public class Question2 {

    public static void PrintInc(int n){
        if(n==10){
            System.out.println(10);
            return;
        }

        System.out.print(n + " ");
        PrintInc(n+1);
    }
    public static void main(String[] args) {

        int n = 1;
        PrintInc(n);

     
        

    }
    
}

