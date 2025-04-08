public class hierarchicalinheri {

    public static void main(String[] args) {

        Fish f1 = new Fish();

        f1.swim();
        f1.breathe();

        Mammal m1 = new Mammal();
        m1.walk();
        
        Bird b1 = new Bird();
        b1.eat();
        b1.breathe();

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
    void swim(){
        System.out.println("Swimming...!!");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walking....!!");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flying...!!");
    }
}