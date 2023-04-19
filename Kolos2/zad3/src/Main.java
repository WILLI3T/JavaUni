public class Main {
    public static void main(String[] args) {
        Trojkat trojkat = new Trojkat();
        Trojkat trojkat2 = new Trojkat(5);
        Rownoboczny rownoboczny = new Rownoboczny(5);
        trojkat.obliczPole();
        trojkat2.obliczPole();
        rownoboczny.obliczPole();
    }
}