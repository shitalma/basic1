public class Square {
    private double side;
    Rectangle rectangle;

    public Square(double side) {
        rectangle = new Rectangle(side,side);
    }
    public double area(){
        return rectangle.area();
    }

    public double perimeter() {
        return rectangle.perimeter();
    }
}
