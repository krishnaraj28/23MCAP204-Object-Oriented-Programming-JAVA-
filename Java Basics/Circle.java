import java.util.Scanner;
public class Circle{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Radius:");
		float a = s.nextFloat();
		double area=3.14*a*a;
		double peri=2*3.14*a;
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+peri);
	}

}