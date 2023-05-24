import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String tekst = "Ala ma kota, kot ma Alę";
        Map<String, Integer> wystapienia = zliczWystapieniaSlow(tekst);
        System.out.println(wystapienia);
    }

    public static Map<String, Integer> zliczWystapieniaSlow(String tekst) {
        Map<String, Integer> wystapienia = new HashMap<>();

        // Podziel tekst na słowa, usuwając znaki interpunkcyjne i zamieniając na małe litery
        String[] slowa = tekst.split("\\s+");

        // Zlicz wystąpienia słów
        for (String slowo : slowa) {
            int ilosc = wystapienia.getOrDefault(slowo, 0);
            wystapienia.put(slowo, ilosc + 1);
        }

        return wystapienia;
    }
}