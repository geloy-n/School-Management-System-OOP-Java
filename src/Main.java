import models.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        // Create Students
        Student s1 = new Student("John", 20);
        Student s2 = new Student("Mark", 21);

        // Create Teacher/s
        Teacher t1 = new Teacher("Matthew", 30, 40000);

        // Create Teacher/s
        Admin a1 = new Admin("Luke", 50000, 8000);

        // Create Course
        Course math = new Course("Mathematics 101", "MATH101");
        Course science = new Course("Science 101", "SCI101");

        // test adding course for teacher
        t1.addCourse(math);
        t1.addCourse(science);

        // Display info
        s1.displayInfo();
        s2.displayInfo();
        t1.displayInfo();
        System.out.println();

        // Counter
        System.out.println("Total Number of Students: " + Student.getTotalStudents());
        System.out.println("Total Number of Teachers: " + Teacher.getTotalTeachers());
        System.out.println();

        // test adding course for students
        s1.enrollCourse(math);
        s2.enrollCourse(science);

        // test displaying courses
        t1.displayCourses();
        s1.displayCourses();
        s2.displayCourses();

        // test Payable arraylist
        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(t1);
        payables.add(a1);

        // test display individual salaries compute total
        // Polymorphism: storing different Payable objects (Teacher, Admin) in one list
        System.out.println();
        double totalPayroll = 0;

        // Polymorphism: runtime polymorphism occurs here
        // Each Payable object responds to computeSalary() based on its actual class
        for (Payable p: payables) {
            double salary = p.computeSalary();
            totalPayroll += salary;

            if (p instanceof Teacher t) {
                t.displayInfo();
            } else if (p instanceof Admin a) {
                a.displayInfo();
            }
        }

        // test Adjust salary
        System.out.println();
        t1.setSalary(45000);

        // test Remove course
        t1.removeCourse(science);

        // Display updated info
        System.out.println();
        t1.displayInfo();
        t1.displayCourses();

    }
}