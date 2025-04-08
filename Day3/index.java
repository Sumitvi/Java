import java.util.Scanner;

public class index{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        int b = sc.nextInt();
        System.out.println("Enter Second Number");


        if(a>b){
            System.out.println("First Number Is Greater");
        }else{
            System.out.println("Second Number Is Greater");
        }
    }
}