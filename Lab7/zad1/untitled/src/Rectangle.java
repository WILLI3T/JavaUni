public class Rectangle extends Shape{
    protected double a;
    protected int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a*this.b;
    }

    @Override
    public double getPerimeter() {
        return 2*this.a + (2*this.b);
    }
}
