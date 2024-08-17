
public class operator {
 public static void main(String[] args) {
    int a = 5;
    int b = 10;

    // Relational Operators
    System.out.println(a==b);
    System.out.println(a!=b);
    System.out.println(a<b);
    System.out.println(a>b);
    System.out.println(a<=b);


    // Logical Operators
    System.out.println("Logical Operators");
    System.out.println((5>4) && (5<2));
    System.out.println((5>4) || (5<2));
   
    System.out.println(5!=4);


    // Assignment Operator
    int d =10;
    // d=d+10
    d+=10;
    System.out.println(d);
    d-=6;
    System.out.println(d);
    d*=5;
    System.out.println(d);
    d/=7;
    System.out.println(d);
 }
    
}