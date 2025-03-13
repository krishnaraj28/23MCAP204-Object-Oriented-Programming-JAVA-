class Student {                                                 //student class
    int studentId; 
    String name;
    double marks;
    Student(int studentId, String name, double marks) {         //constuctor for student class
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails() {                           //display method for displaying student details
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
    public boolean isPassed() {                             //boolean method to determine passed or not                 
        return marks >= 40;
    }
}
public class Mark{                                          //main class
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anu", 50);           //creating class object   
        Student s2 = new Student(102, "Manu", 40);
        Student s3 = new Student(103, "Arun", 39);
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
