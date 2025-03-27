import java.util.Scanner;
public class FindReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();
        System.out.print("Enter the word to find: ");
        String pattern = sc.nextLine();
        if (original.toLowerCase().contains(pattern.toLowerCase())) { //make the orginal one to case sensitive
            System.out.print("Enter the replacement word: ");
            String replacement = sc.nextLine();
            String result = original.replaceAll("(?i)" + pattern, replacement); //replace with pattern
            System.out.println("Modified string: " + result);
        } 
        else {
            System.out.println("The word \"" + pattern + "\" was not found in the string.");
        }
    }
}

