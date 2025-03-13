import java.util.Scanner;
public class Rectangle{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length:");	//reading the length 
		float l=sc.nextFloat();
		System.out.println("Enter the Breadth:");	//reading the breadth 
		float b=sc.nextFloat();
		double area=l*b;				//calculate area
		double peri=2*(l+b);				//calculate the perimeter
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+peri);
		  
	}

}
