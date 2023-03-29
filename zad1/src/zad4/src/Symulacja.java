import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        int iloscOrlow = 0;
        int iloscRzutow = 0;
        System.out.println("Podaj liczbę rzutów");
        Scanner scan = new Scanner(System.in);

           int iloscProb = scan.nextInt();


        Moneta moneta = new Moneta();
        for (int i = 0; i < iloscProb; i++) {
            Moneta.Strona wynik = moneta.rzut();
            if (wynik == Moneta.Strona.ORZEL) {
                iloscOrlow++;
            }
            iloscRzutow++;
        }

        double procentOrlow = ((double) iloscOrlow / iloscRzutow) * 100;
        double procentReszek = 100 - procentOrlow;
        System.out.printf("%.0f%% orzeł | %.0f%% reszka dla %d rzutów.", procentOrlow, procentReszek, iloscRzutow);
    }
}
