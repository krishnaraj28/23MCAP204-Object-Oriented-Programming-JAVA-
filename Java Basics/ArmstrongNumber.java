import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int original=num,sum=0,digits=0,remainder;
        int temp=num;
        while(temp!=0) {
            temp/=10;
            digits++;
        }
        temp=num;
        while(temp!=0) {
            remainder=temp % 10;
            sum+=Math.pow(remainder, digits);
            temp/=10;
        }
        if(sum==num) {
            System.out.println("The number is an Armstrong number.");
        }else{
            System.out.println("The number is not an Armstrong number.");
        }
    }
}