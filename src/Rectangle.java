public class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return this.length * this.breadth;
    }

    public double perimeter() {
        return 2*(this.breadth +this.length);
    }

    public static Rectangle getRectangle(double length, double breadth){
        Rectangle rectangle = new Rectangle(length,breadth);
        return rectangle;
    }
    public static Rectangle getSquare(double length){
        Rectangle rectangle = new Rectangle(length,length);
        return rectangle;
    }
}