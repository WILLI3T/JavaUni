import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Osoba osoba = null;
        while (osoba == null) {
            try {
                System.out.print("Podaj imię: ");
                String imie = scanner.nextLine().trim();
                System.out.print("Podaj nazwisko: ");
                String nazwisko = scanner.nextLine().trim();
                System.out.print("Podaj rok urodzenia: ");
                int rokUrodzenia = Integer.parseInt(scanner.nextLine().trim());
                osoba = new Osoba(imie, nazwisko, rokUrodzenia);
            } catch (Exception e) {
                System.out.println("Nie udało się utworzyć nowego obiektu: " + e.getMessage());
            }
        }
        System.out.println("Utworzono nową osobę: " + osoba.toString());


    }
}