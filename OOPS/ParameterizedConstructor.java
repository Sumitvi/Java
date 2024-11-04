public class ParameterizedConstructor {
    
    public static void main(String[] args) {

        Animal a1 = new Animal("Cat");

    
        
        
    }
}


class Animal   {

    String name = "Harry";



    Animal(String name){
        this.name = name;
        System.out.println(name);
    }
   
    
}