import java.util.Random;

public class Zawodnik {
    private String imie;
    private int predkoscMin;
    private int predkoscMax;
    private double pokonanaOdleglosc;

    public Zawodnik(String imie, int predkoscMin, int predkoscMax) {
        this.imie = imie;
        this.predkoscMin = predkoscMin;
        this.predkoscMax = predkoscMax;
        this.pokonanaOdleglosc = 0;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + imie + ", biegam z prędkością " + predkoscMin + "-" + predkoscMax + "km/h");
    }

    public void biegnij() {
        Random rand = new Random();
        int predkosc = rand.nextInt(predkoscMax - predkoscMin + 1) + predkoscMin;
        double dystans = predkosc * 0.1;
        pokonanaOdleglosc += dystans;
    }

    public double getPokonanaOdleglosc() {
        return pokonanaOdleglosc;
    }

    public String getImie() {
        return imie;
    }
}
