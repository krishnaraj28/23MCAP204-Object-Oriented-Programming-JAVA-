import java.util.Scanner;
public class Job {
    public static void main(String[] args) {
        System.out.println("Employee Salary Calculation");
        System.out.println("Enter Your Job Role:");
        System.out.println("1.Manager\n2.Developer\n3.Intern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Job role (1-3): ");
        int ch = sc.nextInt();
        int baseSalary = 0;
        switch (ch) {
            case 1:
                baseSalary=50000;
                System.out.println("Your role is Manager and base salary is 10000");
                break;
            case 2:
                baseSalary=30000;
                System.out.println("Your role is Developer and base salary is 8000");
                break;
            case 3:
                baseSalary=15000;
                System.out.println("Your role is Intern and base salary is 15000");
                break;
            default:
                System.out.println("Invalid job role selected.");
                return;
        }
        System.out.print("Enter Your Experience (in years): ");
        int experience=sc.nextInt();
        double bonus=0;
        if (experience>=0&&experience<=2) {
            bonus=0; 
        } else if(experience>=3&&experience<=5) {
            bonus=0.10*baseSalary; 
        } else if(experience>5) {
            bonus=0.20*baseSalary;  
        }
        double finalSalary=baseSalary+bonus;
        System.out.println("Final Salary after bonus: "+finalSalary);
    }
}
