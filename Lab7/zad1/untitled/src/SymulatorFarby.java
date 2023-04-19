public class SymulatorFarby {
    public static int obliczZapotrzebowanieNaFarbe(Shape[] shapes,double wielkoscPojemnika){
        double sum = 0;
        for (Shape shape : shapes) {
            sum+=shape.getArea();

        }
        return (int)Math.ceil(sum/wielkoscPojemnika);


    }
}
