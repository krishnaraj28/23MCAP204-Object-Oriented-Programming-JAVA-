import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeEx {

    public static void validateGrade(char grade) throws InvalidGradeException {
        // Check if the grade is between 'A' and 'F'
        if (grade < 'A' || grade > 'F') {
            throw new InvalidGradeException("Grade must be between 'A' and 'F'.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student's grade (A-F): ");
        
        // Read the input and convert it to uppercase
        char grade=sc.nextLine().toUpperCase().charAt(0);

        try {
            validateGrade(grade);
            System.out.println("Grade is valid.");
        } catch (InvalidGradeException e) {
            System.out.println("Invalid grade: " + e.getMessage());     //print the message
        } 
    }
}