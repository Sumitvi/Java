import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

    //     if(marks>=33){
    //         System.out.println("You are pass");
    //     }else {
    //         System.out.println("You are fail");
    //     }

     String total = (marks>=33)? "pass":"Fail";
     System.out.println(total);






    }

   
    
}
