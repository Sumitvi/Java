import java.util.Scanner;

public class Avgofthree {

    public static int Avarage(int a ,int b , int c){
        int avg = (a+b+c)/3;
        return avg;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       int avg =  Avarage(a, b, c);

       System.out.println("Average of Three is " + avg);
        
    }
    
}
