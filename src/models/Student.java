package models;

import java.util.ArrayList;

public class Student extends Person{
    private static int totalStudents = 0;
    private final int studentId;
    private final ArrayList<Course> enrolledCourses = new ArrayList<>();


    // Constructor
    public Student(String name, int age) {
        super(name, age);
        totalStudents++;
        this.studentId = totalStudents;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + ", Age: " + age);
    }

    // Getter for total students
    public static int getTotalStudents() {
        return totalStudents;
    }

    // Add course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Display Courses
    public void displayCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName() + " (" + c.getCourseCode() + ")");
        }
    }

}
