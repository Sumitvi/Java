import java.util.Scanner;

public class Avarageofthree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A");
        int a = sc.nextInt();

        System.out.println("Enter Number b");
        int b = sc.nextInt();

        System.out.println("Enter Number C");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;

        System.out.println("Avarage of Numbers"+ " " + avg);


        sc.close();


        
    }
    
}
