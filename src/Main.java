import models.*;


public class Main {
    public static void main(String[] args) {

        // Create Students
        Student s1 = new Student("John", 20);
        Student s2 = new Student("Mark", 21);

        // Create Teacher/s
        Teacher t1 = new Teacher("Matthew", 30, 40000);

        // Create Course
        Course math = new Course("Mathematics 101", "MATH101");
        Course science = new Course("Science 101", "SCI101");

        // Display info
        s1.displayInfo();
        s2.displayInfo();
        t1.displayInfo();
        System.out.println();

        // Counter
        System.out.println("Total Number of Students: " + Student.getTotalStudents());
        System.out.println("Total Number of Teachers: " + Teacher.getTotalTeachers());
        System.out.println();

        // computeSalary via Payable interface
        System.out.println("Computed Salary: " + t1.computeSalary() + " for Prof. " + t1.getName());
        System.out.println();

        // test adding course for teacher
        t1.addCourse(math);
        t1.addCourse(science);

        // test adding course for students
        s1.enrollCourse(math);
        s2.enrollCourse(science);

        // test displaying courses
        t1.displayCourses();
        s1.displayCourses();
        s2.displayCourses();

    }
}