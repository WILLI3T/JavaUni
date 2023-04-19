public class Circle extends Shape{
    protected double a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.PI*a*a;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*a;
    }
}
