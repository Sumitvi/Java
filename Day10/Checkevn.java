import java.util.Scanner;

public class Checkevn {


    public static boolean isEven(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }

    }


    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number");

       int num = sc.nextInt();
        boolean res = isEven(num);
        System.out.println(res);

        
    }
    
}
