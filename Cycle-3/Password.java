import java.util.Scanner;

class PasswordException extends Exception {             //exception class
    public PasswordException(String message) {
        super(message);                         // Calls the constructor of Exception class
    }
}

public class Password{

    public static void validatePassword(String password) throws PasswordException {     
        if (password.length() < 8) {                                                        //less than 8 characters
            throw new PasswordException("Password must be at least 8 characters long.");
        }
        if (!password.matches(".*\\d.*")) {                                                 //doesn't have numbers
            throw new PasswordException("Password must contain at least one number.");
        }
        if (!password.matches(".*[$#&].*")) {                                               //doesn't have $#&
            throw new PasswordException("Password must contain at least one special character from the set {$#&}.");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password=sc.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password is valid.");
        } catch (PasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());   // Retrieves the message stored in Exception
        } 
    }
}
