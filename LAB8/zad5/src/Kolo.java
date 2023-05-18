public class Kolo implements Figura, Comparable<Kolo> {
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double obliczPole() {
        return Math.PI * promien * promien;
    }

    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    public int compareTo(Kolo innyKolo) {
        return Double.compare(this.obliczPole(), innyKolo.obliczPole());
    }
}
