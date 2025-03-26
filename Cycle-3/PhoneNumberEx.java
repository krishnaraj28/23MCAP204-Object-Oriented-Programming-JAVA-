import java.util.Scanner;

class PhoneNumberException extends Exception {         //exception class
    public PhoneNumberException(String message) {
        super(message);
    }
}

public class PhoneNumberEx{

    public static void validatePhoneNumber(String phoneNumber) throws PhoneNumberException {
        // Check if the phone number has exactly 10 digits
        if (!phoneNumber.matches("\\d{10}")) {
            throw new PhoneNumberException("Phone number must contain exactly 10 digits."); 
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumber=sc.nextLine();

        try {
            validatePhoneNumber(phoneNumber);
            System.out.println("Phone number is valid.");
        } catch (PhoneNumberException e) {
            System.out.println("Invalid phone number: " + e.getMessage());  //Retrieve the msg stored
        } 
    }
}
