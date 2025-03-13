import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");     //take a number as user input
        int num=sc.nextInt();
        int original=num,sum=0,digits=0,remainder;
        int temp=num;
        while(temp!=0) {    //counting the digits of the accepted number
            temp/=10;
            digits++;        //increment the digit
        }
        temp=num;    //intialize temp=num
        while(temp!=0) {            
            remainder=temp % 10;                  //extarcting each number for calculating the power
            sum+=Math.pow(remainder, digits);    //calculating the sum of the power of each digit 
            temp/=10;                            //removing the extracted digit
        }
        if(sum==num) {
            System.out.println("The number is an Armstrong number.");
        }else{
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
