import java.util.Scanner;

public class CountVC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");     //inputing the string
        String text = sc.nextLine();
        text = text.toLowerCase();                      //make the string to lowercase
        int vowels = 0, consonants = 0;                 //intialize vowels and consonants
        for (int i = 0; i < text.length(); i++) {       //scan through the string for counting the vowels & consonants
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

    }
}
