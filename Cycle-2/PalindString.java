import java.util.Scanner;
public class PalindString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word=sc.nextLine().toLowerCase();
        int l=word.length();
        int flag=0;
        for(int i=0;i<l/2;i++) {
            if(word.charAt(i)!=word.charAt(l-1-i)) {
                flag=1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }
    }
}