package models;

public class Teacher extends Person {


    private final int teacherId;
    private static int totalTeachers = 0;

    // Constructor
    public Teacher(String name, int age){
        super(name, age);
        totalTeachers++;
        this.teacherId = totalTeachers;
    }

    // Method overriding
    @Override
    public void displayInfo(){
        System.out.println("Teacher ID: " + teacherId + ", Name: " + name + ", Age: " + age);
    }

    // Getters

    public static int getTotalTeachers() {
        return totalTeachers;
    }

}
