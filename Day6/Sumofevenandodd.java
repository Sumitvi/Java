import java.util.Scanner;

public class Sumofevenandodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        

        int number , choice;
        int evensum=0;
        int oddsum=0;

        do{
            System.out.println("Enter a number");
            number = sc.nextInt();
            if(number % 2 ==0){
                evensum+=number;
            }else{
                oddsum = oddsum+number;
            }

            System.out.println("Do you want to continue 1 for yes and 0 for no");
            choice = sc.nextInt();
            
        }while(choice==1);


        System.out.println("Even Sum is " + evensum);
        System.out.println("Odd Sum is "+ oddsum);

       



    }
    
}
