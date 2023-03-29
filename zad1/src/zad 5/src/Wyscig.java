public class Wyscig {
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Robert", 2, 12);
        Zawodnik zawodnik2 = new Zawodnik("Anna", 3, 10);
        Zawodnik zawodnik3 = new Zawodnik("Marek", 5, 15);

        zawodnik1.przedstawSie();
        zawodnik2.przedstawSie();
        zawodnik3.przedstawSie();

        boolean koniec = false;
        Zawodnik zwyciezca = null;
        while (!koniec) {
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();
            if (zawodnik1.getPokonanaOdleglosc() >= 50) {
                koniec = true;
                zwyciezca = zawodnik1;
            }
            if (zawodnik2.getPokonanaOdleglosc() >= 50) {
                koniec = true;
                zwyciezca = zawodnik2;
            }
            if (zawodnik3.getPokonanaOdleglosc() >= 50) {
                koniec = true;
                zwyciezca = zawodnik3;
            }
        }

        System.out.println("Zwycięzcą wyścigu jest: " + zwyciezca.getImie());
    }
}

