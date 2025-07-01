package models;

public class Admin implements Payable {
    private final String name;
    private double baseSalary;
    private final double allowance;


    // Constructor
    public Admin(String name, double baseSalary, double allowance) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }

    @Override
    public double computeSalary() {
        return baseSalary + allowance;
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
