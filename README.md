# 📚 School Management System (Java OOP Practice)

A simple Java console-based application designed to practice and demonstrate core Object-Oriented Programming (OOP) concepts including **Inheritance**, **Interfaces**, **Polymorphism**, **Aggregation**, and more.

---

## 📌 Features

✅ Manage Students, Teachers, Admin staff, and Courses  
✅ Compute salaries dynamically for Teachers (based on handled courses) and Admins (with fixed allowances)  
✅ Aggregate shared Course objects between Students and Teachers  
✅ Demonstrates runtime polymorphism via a `Payable` interface  
✅ Clean, organized OOP structure and class relationships  

---

## 📖 Concepts Practiced

- ✅ Object-Oriented Programming (OOP)
- ✅ Constructors
- ✅ Overloaded Constructors (optionally extendable)
- ✅ Array of Objects (`ArrayList`)
- ✅ Static variables and methods
- ✅ Inheritance
- ✅ `super` keyword for constructor chaining
- ✅ Method Overriding
- ✅ Abstraction via interfaces
- ✅ Interfaces (`Payable`)
- ✅ Polymorphism (including **runtime polymorphism**)
- ✅ Getters and Setters
- ✅ Aggregation (shared Course objects)
- ✅ Wrapper classes (implicitly via `ArrayList`)
- ✅ Clean sequencing of object state setup and method calls

---

 <pre> ## 📂 Project Structure ``` SchoolManagement/ ├── models/ │ ├── Person.java │ ├── Student.java │ ├── Teacher.java │ ├── Admin.java │ ├── Course.java │ └── Payable.java ├── Main.java └── README.md ``` </pre>


---

## 💻 How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/yourusername/school-management-system-java.git
   cd school-management-system-java

2. Compile the project
   ```bash
   javac models/*.java Main.java
   
4. Run the program
   ```bash
   java Main

## 📌 Sample Output

Student ID: 1, Name: John, Age: 20
Student ID: 2, Name: Mark, Age: 21
Teacher ID: 1, Name: Matthew, Age: 30, Base Salary: 40000.0, Total Salary: 44000.0

Total Number of Students: 2
Total Number of Teachers: 1

Courses handled by Matthew:
- Mathematics 101 (MATH101)
- Science 101 (SCI101)

Courses enrolled by John:
- Mathematics 101 (MATH101)

Courses enrolled by Mark:
- Science 101 (SCI101)

Teacher: Matthew | Base Salary: 40000.0 | Computed Salary: 44000.0
Admin: Luke | Total Salary: 58000.0
Updating base salary for Matthew from 40000.0 to 45000.0

Teacher ID: 1, Name: Matthew, Age: 30, Base Salary: 45000.0, Total Salary: 47000.0
Courses handled by Matthew:
- Mathematics 101 (MATH101)

