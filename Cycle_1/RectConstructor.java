class Rectangle {
    private double length;
    private double width;
    Rectangle() {                                   //default constructor 
        this.length = 1;
        this.width = 1;
    }
    Rectangle(double length, double width) {        //parameterized constructor
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {                 //method for calculate area
        return length * width;
    }
    public double calculatePerimeter() {            //method for calculate perimeter
        return 2 * (length + width);
    }
    public void displayInfo() {                     //method for display details
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }
}
public class RectConstructor{                       //main class
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();          //Rectangle class object creation-default constructor
        System.out.println("Rectangle 1 (Default Constructor):");
        rect1.displayInfo();
        Rectangle rect2 = new Rectangle(7.0,5.5);    //Rectangle class object creation-parameterized constructor       
        System.out.println("Rectangle 2 (Parameterized Constructor):");
        rect2.displayInfo();
    }
}
