public class constuctor {
    
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.Getname();
        
    }
}


class Animal   {


    Animal(){
        System.out.println("Non Parameterized Constructor");
    }
    String name = "Harry";

    void Getname(){
        System.out.println(name);
    }

    
}