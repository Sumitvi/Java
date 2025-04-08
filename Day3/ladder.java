import java.util.Scanner;

public class ladder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int age = sc.nextInt();


        if(age>=18){
            System.out.println("You Can Drive");
        }else if(age<14){
            System.out.println("Even You Can'nt touch the Vechicle");
        }else{
            System.out.println("You Can'nt Drive");
        }
    }
    
}
