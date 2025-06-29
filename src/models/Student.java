package models;

public class Student extends Person{
    private static int totalStudents = 0;
    private final int studentId;


    // Constructor

    public Student(String name, int age) {
        super(name, age);
        totalStudents++;
        this.studentId = totalStudents;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId + " , Name: " + name + ", Age: " + age);
    }

    // Getter for total students
    public static int getTotalStudents() {
        return totalStudents;
    }
}
