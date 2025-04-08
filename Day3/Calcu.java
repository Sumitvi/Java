import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter Operator +,-,%,*,/");
        char Operator = sc.next().charAt(0);

        switch(Operator){
            case '+':
            System.out.println("Addition is " + (a+b));
            break;

            case '-':
            System.out.println("Substriction is " + (a-b));
            break;

            case '/':
            System.out.println("Division is " + (a/b));
            break;

            case '*':
            System.out.println("Multiplication is " + (a*b));
            break;

            case '%':
            System.out.println("Modulus is " + (a%b));
            break;
        }
    }
}
