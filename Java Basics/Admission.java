import java.util.Scanner;
public class Admission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mark of Math:");	//input from user
		float maths=sc.nextFloat();
		System.out.println("Enter the Mark of Physics:");
		float physics=sc.nextFloat();
		System.out.println("Enter the Mark of Chemistry:");
		float chemistry=sc.nextFloat();
		double total=maths+physics+chemistry;	//total mark calculation
		double mapy=maths+physics;
		System.out.println("TOTAL:"+total); 	//total mark
		System.out.println("TOTAL(Maths+Physics):"+mapy); //mark of physics+maths
		if(maths>=60 && physics>=50 && chemistry>=40 &&total>=200||mapy>=150) { 	//eligible candidate checking usingg if-else
			System.out.println("Eligible Candiate");	
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
