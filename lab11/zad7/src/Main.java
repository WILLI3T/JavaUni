import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Ala");
        lista.add("ma");
        lista.add("kota");
        lista.add("i");
        lista.add("psa");

        List<String> kopia = kopiaElementowParzystejDlugosci(lista);
        System.out.println("Oryginalna lista: " + lista);
        System.out.println("Kopia listy (elementy o parzystej długości): " + kopia);
    }

    public static List<String> kopiaElementowParzystejDlugosci(List<String> lista) {
        List<String> kopia = new ArrayList<>();

        for (String element : lista) {
            if (element.length() % 2 == 0) {
                kopia.add(element);
            }
        }

        return kopia;
    }
}