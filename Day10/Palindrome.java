import java.util.Scanner;

public class Palindrome {


    public static void isPalindrome(int num){
        int sum =0;
        int temp = num;
        while(num>0){
            int rev = num %10;
            sum = (sum*10) + rev;
            num = num/10;

            
        }


        if(temp ==sum){
            System.out.println("Number is Palindrome");
        }else{

            System.out.println("Number is not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
         isPalindrome(num);
      
        

    }
    
}
