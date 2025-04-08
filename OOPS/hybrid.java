public class hybrid {

    public static void main(String[] args) {

        Shark s1 = new Shark();
        System.out.println(s1.Danger);

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        
    }

    
}

class Animal{

    void eat(){
        System.out.println("Eating...!!");
    }

    void breathe(){
        System.out.println("Breathing...!!");
    }

}


class Fish extends Animal{
    
    void swaiming(){
        System.out.println("swimming...!!");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flying...!!");
    }
}

class Mammal extends Animal{ 
    void walk(){
        System.out.println("Walking...!!");
    }
}

class Shark extends Fish{
    
    boolean Danger = true;
}

 class tuna extends Fish{
    boolean Danger = false;

    
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Barking...!!");
    }
}