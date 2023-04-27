public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Kwadrat kwadrat = new Kwadrat(5);
        Prostokat prostokat = new Prostokat(5,5);
        Prostopadloscian prostopadloscian = new Prostopadloscian(5,5,5);
        Szescian szescian = new Szescian(5);
        System.out.println(kwadrat.obliczObwod());
        System.out.println(kwadrat.obliczPole());
        System.out.println(prostokat.obliczObwod());
        System.out.println(prostokat.obliczPole());
        System.out.println(prostopadloscian.obliczObwod());
        System.out.println(prostopadloscian.obliczPole());
        System.out.println(prostopadloscian.obliczObjetosc());
        System.out.println(szescian.obliczObwod());
        System.out.println(szescian.obliczPole());
        System.out.println(szescian.obliczObjetosc());
    }
}