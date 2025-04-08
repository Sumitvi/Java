import java.util.Scanner;

public class input {
    public static void main(String[] args) {
      int marks[] = new int[50];

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter marks of physics chemistry and maths");
      marks[0] = sc.nextInt();
      marks[1]=sc.nextInt();
      marks[2]=sc.nextInt();


      System.out.println("Physics = " + marks[0]);
      System.out.println("Chemistry = " + marks[1]);
      System.out.println("Maths = " + marks[2]);

    //   Length of array

    System.out.println(marks.length);



    //   UPDATION IN ARRAY

    marks[1]=100;
    System.out.println("Chemistry = " + marks[1]);



    }
    
}
