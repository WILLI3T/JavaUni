import java.util.Comparator;

public class SortowanieFigur implements Comparator<Figura> {
    public int compare(Figura figura1, Figura figura2) {
        return Double.compare(figura1.obliczPole(), figura2.obliczPole());
    }
}
