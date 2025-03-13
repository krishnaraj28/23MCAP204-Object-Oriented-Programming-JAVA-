class Student {
    int studentId; 
    String name;
    double marks;
    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        if (isPassed()) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
        System.out.println();
    }
    public boolean isPassed() {
        return marks >= 40;
    }
}
public class Mark{
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anu", 50);
        Student s2 = new Student(102, "Manu", 40);
        Student s3 = new Student(103, "Arun", 39);
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
