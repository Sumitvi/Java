import java.util.Scanner;

public class ThreeLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        if(a>b && a>b){
            System.out.println("Number a is greater");
        }else if(b>c){
            System.out.println("B is Greater");
        }else{
            System.out.println("Number C is Greater");
        }
    }
    
}
