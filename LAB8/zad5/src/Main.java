import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = new Figura[3];
        figury[0] = new Kwadrat(5);
        figury[1] = new Kolo(3);
        figury[2] = new Prostokat(4, 6);

        Arrays.sort(figury, new SortowanieFigur());

        for (Figura figura : figury) {
            System.out.println("Pole: " + figura.obliczPole());
            System.out.println("Obwód: " + figura.obliczObwod());
            System.out.println();
        }
    }
}