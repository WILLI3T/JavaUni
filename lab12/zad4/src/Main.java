import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String tekst = scanner.nextLine();
        Map<String, Integer> wynik = zliczSamogloski(tekst);
        System.out.println(wynik);
    }

    public static Map<String, Integer> zliczSamogloski(String tekst) {
        Map<String, Integer> mapaSamoglosek = new HashMap<>();
        String samogloski = "aeiouyąęóAEIOUYĄĘÓ";

        for (int i = 0; i < tekst.length(); i++) {
            char znak = Character.toLowerCase(tekst.charAt(i));

            if (samogloski.contains(String.valueOf(znak))) {
                String samogloska = String.valueOf(znak);
                int ilosc = mapaSamoglosek.getOrDefault(samogloska, 0);
                mapaSamoglosek.put(samogloska.toUpperCase(), ilosc + 1);
            }
        }

        return mapaSamoglosek;
    }
}
