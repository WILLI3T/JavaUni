public class Main {
    public static void main(String[] args) {
        for (Kolor k : Kolor.values()) {
            for (Figura f : Figura.values()) {
                Karta karta= new Karta(k,f);
                karta.wypisz();
            }
        }
    }
}