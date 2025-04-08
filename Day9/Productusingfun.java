import java.util.Scanner;

public class Productusingfun{

    public static int Multiply(int a , int b){
        int product = a*b;
        return product;

    }
   public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();

   int prod= Multiply(a, b);
   System.out.println("Product is "+prod);


   }
}