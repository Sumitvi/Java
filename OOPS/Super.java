public class Super {

    public static void main(String args[]){

        Buggati b = new Buggati();

    }
    
}


class Car{
    Car(){
        System.out.println("Constructor is called");
    }
}

class Buggati extends Animal{

    Buggati(){
        System.out.println("Buggati Constructor is called");
    }

}