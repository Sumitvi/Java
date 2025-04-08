import java.util.Scanner;

public class tempcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Temprature");
        int num = sc.nextInt();

        if(num<=100){
            System.out.println("You don'nt have fever");
        }else{
            System.out.println("You have  Fever");
        }
    }
    
}
