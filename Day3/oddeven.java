import java.util.Scanner;

public class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Number is Even  "+ a);
        }else{

            System.out.println("Number is odd  "+ a);

        }
    }
    
}
