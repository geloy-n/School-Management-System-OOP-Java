import models.Student;
import models.Teacher;

public class Main {
    public static void main(String[] args) {

        // Create Students
        Student s1 = new Student("John", 20);
        Student s2 = new Student("Mark", 21);
        Teacher t1 = new Teacher("Matthew", 30, 40000);

        // Display info
        s1.displayInfo();
        s2.displayInfo();
        t1.displayInfo();

        // Counter
        System.out.println("Total Number of Students: " + Student.getTotalStudents());
        System.out.println("Total Number of Teachers: " + Teacher.getTotalTeachers());

        // computeSalary via Payable interface
        System.out.println("Computed Salary: " + t1.computeSalary() + " for Prof. " + t1.getName());

    }
}