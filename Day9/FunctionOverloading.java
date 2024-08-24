public class FunctionOverloading {

    public static int Sum(int a , int b){
        return (a+b);
    }

    public static int Sum(int a, int b ,int c){
        return (a+b+c);
    }

    public static int Sum(int a , int b ,int c , int d){
        return (a+b+c+d);
    }
    public static void main(String args[]){

        int res=Sum(8, 12);
        int res1= Sum(19,28,6);
        int res2=Sum(20,17,2,34);

        System.out.println("Sum of two Paramerters " + res);
        System.out.println("Sum of Three Paramerters " + res1);
        System.out.println("Sum of Four Paramerters " + res2);

    }
    
}
