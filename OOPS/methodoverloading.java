public class methodoverloading {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.sum(10, 14);
        c1.sum(20, 29, 20);
        c1.sum(20, 29, 10 , 11);
        
    }
    
}


class Calculator{
    void sum(int a ,int b){
        System.out.println(a+b);
    }


    void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }

    void sum(int a , int b , int c, int d){
        System.out.println(a+b+c+d);
    }
}