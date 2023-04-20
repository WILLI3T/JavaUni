import java.io.InterruptedIOException;
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
        System.out.println("(+) dodawanie\n" +
                "(-) odejmowanie\n" +
                "(*) mnożenie\n" +
                "(/) dzielenie");
        String linia = scanner.nextLine();
        try {
            return switch (linia) {
                case "+" -> 1;
                case "-" -> 2;
                case "*" -> 3;
                case "/" -> 4;
                default -> throw new RuntimeException("Nieprawidłowy znak");
            };
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
            return wyborDzialania();
        }
    }
    public void liczenie(Integer x, Integer y, int a){
        switch (a){
            case 1 -> System.out.println("wynik to: "+(x+y));
            case 2 -> System.out.println("wynik to: "+(x-y));
            case 3 -> System.out.println("wynik to: "+(x*y));
            case 4 -> System.out.println("wynik to: "+((double)x/y));
        }
    }
}