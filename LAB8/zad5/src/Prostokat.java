public class Prostokat implements Figura, Comparable<Prostokat> {
    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double obliczPole() {
        return bokA * bokB;
    }

    public double obliczObwod() {
        return 2 * (bokA + bokB);
    }

    public int compareTo(Prostokat innyProstokat) {
        return Double.compare(this.obliczPole(), innyProstokat.obliczPole());
    }
}
