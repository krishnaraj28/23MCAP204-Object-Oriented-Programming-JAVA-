import java.util.Scanner;
public class Job {
    public static void main(String[] args) {
        System.out.println("Employee Salary Calculation");
        System.out.println("Enter Your Job Role:");                
        System.out.println("1.Manager\n2.Developer\n3.Intern");     // Displaying the job role options   
        Scanner sc = new Scanner(System.in);                        
        System.out.print("Enter your Job role (1-3): ");           //accept the role from user 
        int ch = sc.nextInt();
        int baseSalary = 0;                                        // Initializing base salary
        switch (ch) {                                              // assign base salary based on job role using switch-case
            case 1:
                baseSalary=50000;
                System.out.println("Your role is Manager and base salary is 50000");
                break;
            case 2:
                baseSalary=30000;
                System.out.println("Your role is Developer and base salary is 30000");
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
        int experience=sc.nextInt();                                   //Reading the user's experience
        double bonus=0;                                                //intialize the bonus
        if (experience>=0&&experience<=2) {                            //compute the bonus based on years of experience
            bonus=0; //no bonus 
        } else if(experience>=3&&experience<=5) {
            bonus=0.10*baseSalary;     //10% bonus for 3-5 year of experience
        } else if(experience>5) {
            bonus=0.20*baseSalary;     //20% bonus for more than 5 year
        }
        double finalSalary=baseSalary+bonus;    //calculating teh final salary
        System.out.println("Final Salary after bonus: "+finalSalary);
    }
}
