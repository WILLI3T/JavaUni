import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String tekst = "Ala ma kota";

        int liczbaUnikatowych = liczbaUnikatowychZnakow(tekst);
        System.out.println("Liczba unikatowych znaków: " + liczbaUnikatowych);
    }

    public static int liczbaUnikatowychZnakow(String tekst) {
        Set<Character> unikatoweZnaki = new HashSet<>();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            unikatoweZnaki.add(znak);
        }

        return unikatoweZnaki.size();
    }
}