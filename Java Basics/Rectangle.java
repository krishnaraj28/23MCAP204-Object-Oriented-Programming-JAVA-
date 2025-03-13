import java.util.Scanner;
public class Rectangle{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length:");
		float l=sc.nextFloat();
		System.out.println("Enter the Breadth:");
		float b=sc.nextFloat();
		double area=l*b;
		double peri=2*(l+b);
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+peri);
		  
	}

}