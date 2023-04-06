public class Main {
    public static void main(String[] args) {
        Pojazd[] tab = new Pojazd[3];

        tab[0] = new Pojazd(4,"zielony","\"boop boop\"");
        tab[1] = new Samochod(6,"ruszofy","\"łijo łijo\"","gigaspoko");
        tab[2] = new Rower(3,"blue","brak(nie starczyło sianka)","bardzocool");

        for (Pojazd pojazd:tab) {

            pojazd.informacje();
        }
    }
}