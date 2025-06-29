package models;

public class Teacher extends Person implements Payable{

    private final double baseSalary;
    private final int teacherId;
    private static int totalTeachers = 0;

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

}
