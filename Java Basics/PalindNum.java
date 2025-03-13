import java.util.Scanner;
public class PalindNum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();                        //reading  the number from user
        int originalNum = num;                         //Assign the orginal number to the variable 
        int reversedNum = 0;                           //intialize a variablle to store the reversed number 

        while (num > 0) {                              //Continue until the number is less than 0
            int digit = num % 10;                      //extarct the last digit
            reversedNum = reversedNum * 10 + digit;    //add that to the the variable that store the reversed number 
            num /= 10;                                 //remove the last digit
        }

        if (originalNum == reversedNum) {            //check if revesed and orginal number is same
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
