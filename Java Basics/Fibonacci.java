import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();                //accept the limit
        int a=1,b=1,c;                           //intializing the first 2 numbers in the fibanocci series
        System.out.println("Fibonacci sequence up to " + limit + ":");
        while (a<=limit) {                        
            System.out.print(a + " ");            //printing the current element in the series
            c=a+b;                                //calculating the next element in the series 
            a=b;                                  // Move the current number to the previous position
            b=c;                                  // Move the next number to the current position 
        }
    }
}
