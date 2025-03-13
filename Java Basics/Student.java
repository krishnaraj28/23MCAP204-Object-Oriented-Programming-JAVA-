import java.util.Scanner;
public class Student{
	public static void main(String[] args) {
		char grade;
		System.out.println("Enter the Mark:");
		Scanner sc=new Scanner(System.in);
		float mark=sc.nextFloat();		//reading the mark
		if(mark>=90) {				//Determine the grade using the if-else structure
			System.out.println("A");
			grade='A';
		}
		else if(mark<=89&&mark>=80){
			System.out.println("B");
			grade='B';
		}
		else if(mark<=79&&mark>=70){
			System.out.println("C");
			grade='C';
		}
		else if(mark<=69&&mark>=60){
			System.out.println("D");
			grade='D';
		}
		else{
			System.out.println("F");
			grade='F';
		}
		switch(grade) {						//diplay message using switch-case based on the grade
			case 'A':
				System.out.println("Excellent Work");
				break;
			case 'B':
				System.out.println("Good Job");
				break;
			case 'C':
				System.out.println("You can do better");
				break;
			case 'D':
				System.out.println("Work Harder");
				break;
			case 'F':
				System.out.println("Failed Try again");
				break;
				
		}
			
	}

}
