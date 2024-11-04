public class OopConcepts {

     public static void main(String[] args) {
      
      Pen p1 = new Pen();
      p1.setColor("Blue");
      System.out.println(p1.Color);


      Student s1 = new Student();
      s1.setAge(20);
      System.out.println(s1.age);

      s1.setPercentage(70, 60, 90);
      System.out.println(s1.Percentage);


      BankAccount Acc1 = new BankAccount();

      System.out.println(Acc1.UserName);
     
      System.out.println(Acc1.setPass(12333));
          






     }
}




class BankAccount{
     public String UserName = "SumitVishwakarma";
     private int PassWord ;


     public int setPass(int newPass){
          PassWord = newPass;
          return PassWord;
     }

}

class Pen{
      String Color;
      int Tip ;

     void setColor(String NewColor){
      Color = NewColor;
     }


     void SetTip(int NewTip){
      Tip = NewTip;
     }

}


class Student{
     String name;
     int age;
     int Percentage;

     void setAge(int newAge){
          age = newAge;
     }

     void setPercentage(int phy , int che , int math){
          Percentage = (phy + che + math)/3;

     }
     

}