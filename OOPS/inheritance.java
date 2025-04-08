public class inheritance {

    public static void main(String[] args) {

        Fish f1 = new Fish();

        f1.breathe();
        f1.eat();
        f1.color = "black";
        System.out.println(f1.color);
        
    }
    
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eating...!!");
    }

    void breathe(){
        System.out.println("Breathing...!!");
    }
}


class Fish extends Animal{


    void Skew(){
        System.out.println("Skewing...!!");
    }
}
