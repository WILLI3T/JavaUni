public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        Square square = new Square(5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5,5);
        Shape[] shapes = {rectangle,square,circle,triangle};
        for (Shape shape : shapes) {
            System.out.println("Area: "+shape.getArea());
            System.out.println("Perimiter: "+shape.getPerimeter());
        }
    }
}