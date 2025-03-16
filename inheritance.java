// Base class Person
class Person {
    String name;
    int age;
    String phoneNumber;
    String address;

    // Constructor
    public Person(String name, int age, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Method to print general details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

// Subclass Student
class Student extends Person {
    String course;

    // Constructor
    public Student(String name, int age, String phoneNumber, String address, String course) {
        super(name, age, phoneNumber, address);
        this.course = course;
    }

    // Method to print course details
    public void printCourse() {
        System.out.println("Course: " + course);
    }
}

// Subclass Teacher
class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher(String name, int age, String phoneNumber, String address, String subject) {
        super(name, age, phoneNumber, address);
        this.subject = subject;
    }

    // Method to print subject details
    public void printSubject() {
        System.out.println("Subject: " + subject);
    }
}

// Main class to test the implementation
public class inheritance {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Jashwanth", 20, "1234567890", "MVP Colony", "Computer Science ");
        System.out.println("Student Details:");
        student.printDetails();
        student.printCourse();

        System.out.println();

        // Creating a Teacher object
        Teacher teacher = new Teacher("Mr.Madhav Prasad", 48, "9876543210", "Scindia", "Quantum Mechanics");
        System.out.println("Teacher Details:");
        teacher.printDetails();
        teacher.printSubject();
    }
}
