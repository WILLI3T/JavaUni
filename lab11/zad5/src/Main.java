import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String tekst = "Ala ma kota";
        Map<String, Integer> wynik = zliczLitery(tekst);
        System.out.println(wynik);
    }

    public static Map<String, Integer> zliczLitery(String tekst) {
        Map<String, Integer> wynik = new HashMap<>();
        int samogloski = 0;
        int spolgloski = 0;

        tekst = tekst.toLowerCase(); // Zamień tekst na małe litery dla jednolitego liczenia

        for (int i = 0; i < tekst.length(); i++) {
            char litera = tekst.charAt(i);

            if (litera >= 'a' && litera <= 'z') {
                if (czySamogloska(litera)) {
                    samogloski++;
                } else {
                    spolgloski++;
                }
            }
        }

        wynik.put("samogłoski", samogloski);
        wynik.put("spółgłoski", spolgloski);

        return wynik;
    }

    public static boolean czySamogloska(char litera) {
        return litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u' || litera == 'y';
    }
}
