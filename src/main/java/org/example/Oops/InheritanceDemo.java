package org.example.Oops;

 class Demo{

     public void eat(){
         System.out.println("Eating");
     }

}

class Child extends Demo{
     public void code(){
         System.out.println("Coding");

     }
}

class NewChild extends Child{
     public void sleep(){
         System.out.println("Sleeping");
     }
}




public class InheritanceDemo {

    public static void main(String args[]){

        NewChild obj = new NewChild();
        obj.eat();
        obj.code();
        obj.sleep();


//        Type of Inheritance in Java
//        1. Single inheri...
//        2. Multilevel
//        3. hierarchical
//        4. hybrid

    }
}
