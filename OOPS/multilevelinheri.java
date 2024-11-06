public class multilevelinheri {

    public static void main(String args[]){

        Dog d1 = new Dog();
        d1.eat();
        d1.breathe();
        System.out.println(d1.isBreed);
        System.out.println(d1.legs);

    }
    
}


 class Animal{
    void eat(){
        System.out.println("Eating");
    }

    void breathe(){
        System.out.println("Breathing");
    }
}


class Mammals extends Animal{
    int legs = 4;


}

class Dog extends Mammals{
     boolean isBreed = true;
}