import java.util.Scanner;

public class ProductofValue {

    public static int Product(int num1 , int num2){
       
        int pro = (num1*num2);
        return pro;
        



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
       

       int provalue = Product(a,b);
       System.out.println("Product is "+provalue);

        // System.out.println(pro);

    }
    
}
