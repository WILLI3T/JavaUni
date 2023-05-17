public class Kwadrat implements Figura, Comparable<Kwadrat> {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double obliczPole() {
        return bok * bok;
    }

    public double obliczObwod() {
        return 4 * bok;
    }

    public int compareTo(Kwadrat innyKwadrat) {
        return Double.compare(this.obliczPole(), innyKwadrat.obliczPole());
    }
}