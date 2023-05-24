import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String tekst = "oonamaxa";
        Map<String, Set<Integer>> skorowidz = skorowidzLiterowy(tekst);
        System.out.println(skorowidz);
    }

    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {
        Map<String, Set<Integer>> skorowidz = new HashMap<>();

        // Rozdziel tekst na pojedyncze litery
        String[] litery = tekst.split("");

        // Iteruj przez litery i aktualizuj indeksy wystąpień
        for (int i = 0; i < litery.length; i++) {
            String litera = litery[i];
            Set<Integer> indeksy = skorowidz.getOrDefault(litera, new HashSet<>());
            indeksy.add(i);
            skorowidz.put(litera, indeksy);
        }

        return skorowidz;
    }
}