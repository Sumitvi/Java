import java.util.Scanner;

public class initialisation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[4];
        

        System.out.println("Enter Array Elements");
        for(int i =1;i<marks.length;i++){
             marks[i]= sc.nextInt();

        }


        System.out.println("Array Elements are");
        for(int j=1;j<marks.length;j++){
            System.out.println(marks[j] + " ");
        }
    }
   
    
    
}