import java.util.Scanner;

public class multitable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
       

        for(int i =1;i<=10;i++){
              int multi = number*i;
              System.out.println(multi);
        }
       

    }
    
}
