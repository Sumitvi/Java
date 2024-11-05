public class copyconstructor {

    public static void main(String[] args) {
        
        Student s1 = new Student("Sumit", 20);
        s1.display();

        Student s2 = new Student(s1);
        s2.display();

    }
}

class Student{
    String name;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name + " age is "+ age);
    }

    Student(Student student){
        this.name = student.name;
        this.age = student.age;
    }

}

