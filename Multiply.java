import java.util.Scanner;

public class Multiply {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();


        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int product = a*b;

        System.out.println(product);


        sc.close();
    }
    
}
