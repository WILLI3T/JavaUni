import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> liczby = pobierzLiczby();
        int suma = obliczSume(liczby);
        System.out.println("Suma liczb: " + suma);
    }

    public static Set<Integer> pobierzLiczby() {
        Set<Integer> liczby = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 unikatowych liczb:");

        while (liczby.size() < 10) {
            int liczba = scanner.nextInt();
            liczby.add(liczba);
        }

        return liczby;
    }

    public static int obliczSume(Set<Integer> liczby) {
        int suma = 0;

        for (int liczba : liczby) {
            suma += liczba;
        }

        return suma;
    }
}
