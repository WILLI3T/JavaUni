import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Maciej","Ciombor");
        System.out.println(osoba1.toString());
        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(osoba1);
        listaOsob.add(new Osoba("Tom", "Hanks"));
        listaOsob.add(new Osoba("Leonardo", "DiCaprio"));
        listaOsob.add(new Osoba("Martyna", "Zmiczerewska"));
        System.out.println("Przed:");
        for (Osoba osoba : listaOsob) {
            System.out.println(osoba);
        }
        Collections.sort(listaOsob);

        System.out.println("Po sortowaniu:");
        for (Osoba osoba : listaOsob) {
            System.out.println(osoba);
        }
    }
}