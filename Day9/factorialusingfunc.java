import java.util.Scanner;

public class factorialusingfunc {

    public static int Factorial(int n){
        int num =1;
        for(int i =1;i<=n;i++){
             num = num*i;
          
        }
        return num;
      
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = Factorial(num);
        System.out.println("Factorial is "+fact);
        
    }
    
}
