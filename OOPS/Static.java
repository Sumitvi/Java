public class Static {

    public static void main(String[] args) {
        
        Student s1 = new Student();
       
      s1.setName("KV");
      System.out.println(s1.getName());


      Student s2 = new Student();
      s2.getName();

    }
    
}

class Student{
    String name;
    String rollNo;

    static String schoolName;

    void setName( String schoolName){
        this.schoolName = schoolName;
    }

    String getName(){
        return this.schoolName;
    }

}