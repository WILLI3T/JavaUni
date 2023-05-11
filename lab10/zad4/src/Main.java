import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj format daty i czasu (np. yyyy-MM-dd HH:mm:ss): ");
        String format = scanner.nextLine();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formattedDate = now.format(formatter);
        System.out.println("Obecna data i czas w formacie " + format + ": " + formattedDate);
    }
}
