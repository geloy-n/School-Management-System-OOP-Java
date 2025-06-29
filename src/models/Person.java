package models;

public abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void displayInfo();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
