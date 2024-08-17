import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();

        if(year%4==0 && year%100==0 && year%400==0){
            System.out.println("It is leap year " + (year) ) ;
        }else{
            System.out.println("It is not leap year " + (year));
        }
    }
    
}
