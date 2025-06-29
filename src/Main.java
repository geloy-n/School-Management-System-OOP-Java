import models.Student;

public class Main {
    public static void main(String[] args) {

        // Create Students
        Student s1 = new Student("John", 20);
        Student s2 = new Student("Mark", 21);

        // Display info
        s1.displayInfo();

        // Counter
        System.out.println("Total Number of Students: " + Student.getTotalStudents());

    }
}