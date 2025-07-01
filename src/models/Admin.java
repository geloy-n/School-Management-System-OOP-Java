package models;

public class Admin extends Person implements Payable {
    private double baseSalary;
    private final double allowance;


    // Constructor
    public Admin(String name, double baseSalary, double allowance) {
        super(name, 0);
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }

    @Override
    public double computeSalary() {
        return baseSalary + allowance;
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Name: " + name + ", Base Salary: " + baseSalary + ", Allowance: " + allowance + ", Total Salary: " + computeSalary());
    }

    public String getName() {
        return name;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            System.out.println("Updating salary for " + name + " from " + baseSalary + " to " + newSalary);
            baseSalary = newSalary;
        }
    }

}
