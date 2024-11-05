class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class copyconstructor {
    public static void main(String[] args) {
        // Creating an object of Student
        Student student1 = new Student("Alice", 20);

        // Creating a copy of student1 using the copy constructor
        Student student2 = new Student(student1);

        // Displaying details of both students
        student1.display();
        student2.display();
    }
}
