import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        int a=1,b=1,c;
        System.out.println("Fibonacci sequence up to " + limit + ":");
        while (a<=limit) {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
