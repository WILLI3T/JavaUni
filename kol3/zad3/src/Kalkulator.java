
import java.util.Objects;
import java.util.Scanner;

public class Kalkulator {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Kalkulator().run();

    }

    public void run() {
        boolean exit = false;
        while (!exit){
            int input = wyborDzialania();
            System.out.println("Podaj pierwszą liczbę");
            Integer liczba1 = pobierzLiczbe();
            System.out.println("Podaj drugą liczbę");
            Integer liczba2 = pobierzLiczbe();
            liczenie(liczba1, liczba2, input);
            System.out.println("press y to continue");
            String input2 = scanner.nextLine();
            if(Objects.equals(input2, "y")){
                continue;
            }else {
                exit = true;
            }


        }

    }

    public Integer pobierzLiczbe() {
        Integer liczba;
        try {
            String linia = scanner.nextLine();
            liczba = Integer.parseInt(linia);
        } catch (NumberFormatException ex) {
            System.out.println("Nie udało się sparsowac liczby, spróbuj jeszcz raz");
            liczba = pobierzLiczbe();
        }
        return liczba;
    }
    public int wyborDzialania(){
        System.out.println("Wybierz metodę obliczenia");
        System.out.println("1. dodawanie\n" +
                "2. odejmowanie\n" +
                "3. mnożenie\n" +
                "4. dzielenie");
        String linia = scanner.nextLine();
        try {
            return switch (linia) {
                case "1" -> 1;
                case "2" -> 2;
                case "3" -> 3;
                case "4" -> 4;
                default -> throw new RuntimeException("Nieprawidłowy znak");
            };
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
            return wyborDzialania();
        }
    }
    public void liczenie(Integer x, Integer y, int a){
        switch (a){
            case 1 -> System.out.println("wynik dodawania na liczbach "+x+" oraz "+y+" to: "+(x+y));
            case 2 -> System.out.println("wynik odejmowania na liczbach "+x+" oraz "+y+" to: "+(x-y));
            case 3 -> System.out.println("wynik mnożenia na liczbach "+x+" oraz "+y+" to: "+(x*y));
            case 4 -> System.out.println("wynik dzielenia na liczbach "+x+" oraz "+y+" to: "+((double)x/y));
        }
    }
}

