class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public void displayInfo() {
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }
}
public class RectConstructor{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 (Default Constructor):");
        rect1.displayInfo();
        Rectangle rect2 = new Rectangle(5.0, 3.5);
        System.out.println("Rectangle 2 (Parameterized Constructor):");
        rect2.displayInfo();
    }
}
