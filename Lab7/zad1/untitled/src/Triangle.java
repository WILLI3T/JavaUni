public class Triangle extends Shape{
    protected double a;
    protected double h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a*h)/2 ;
    }

    @Override
    public double getPerimeter() {
        return 3*a;
    }
}
