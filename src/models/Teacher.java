package models;

import java.util.ArrayList;

public class Teacher extends Person implements Payable{

    private final double baseSalary;
    private final int teacherId;
    private static int totalTeachers = 0;
    private final ArrayList<Course> courses = new ArrayList<>();

    // Constructor
    public Teacher(String name, int age, double baseSalary){
        super(name, age);
        this.baseSalary = baseSalary;
        totalTeachers++;
        this.teacherId = totalTeachers;
    }



    // Implementing computeSalary()
    @Override
    public double computeSalary(){
        return baseSalary;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + teacherId + ", Name: " + name +
                ", Age: " + age +
                ", Base Salary: " + baseSalary +
                ", Total Salary: " + computeSalary());
    }

    // Getters

    public double getSalary(){
        return baseSalary;
    }

    public static int getTotalTeachers() {
        return totalTeachers;
    }
    
    // Adding course
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    // Displaying course
    public void displayCourses() {
        System.out.println("Courses handled by " + name + ":");
        for(Course c: courses) {
            System.out.println("- " + c.getCourseName() + " (" + c.getCourseCode() + ") ");
        }
    }

}
