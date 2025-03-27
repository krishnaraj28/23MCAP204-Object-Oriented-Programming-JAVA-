import java.util.Scanner;

// Base class: Person
class Person {
    protected String name;
    protected String gender;
    protected String address;
    protected int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Derived class: Employee (inherits from Person)
class Employee extends Person {
    protected int empId;
    protected String companyName;
    protected String qualification;
    protected double salary;

    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Derived class: Teacher (inherits from Employee)
class Teacher extends Employee {
    private String subject;
    private String department;
    private int teacherId;

    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary,
                   String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Method to display teacher details
    public void display() {
        System.out.println("------------------------------------------------");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("-------------------------------------------------");
    }
}

// Main class to test the system
public class MainTeacher{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Teacher[] teachers = new Teacher[n];

        // Input teacher details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Qualification: ");
            String qualification = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Teacher ID: ");
            int teacherId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Creating Teacher object
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }

        // Display teacher details
        System.out.println("\nDetails of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }
}
