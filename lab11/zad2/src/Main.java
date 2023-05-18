import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        play();

    }
    public static void play(){
        Set<Integer> losowe = randomNumber();
        Set<Integer> wybrane = chooseNumber();
        System.out.println("Twoje numery: "+wybrane);
        System.out.println("Wylosowane numery: "+losowe);
        int numberOfHits = numberOfHits(losowe,wybrane);
        System.out.println("Liczba trafień: "+numberOfHits);
    }
    private static Set<Integer> chooseNumber() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> chosenNumbers = new HashSet<>();
        System.out.println("Wybierz 6 liczb z zakresu 1-49:");
        while (chosenNumbers.size() < 6) {
            try {
                int liczba = scanner.nextInt();
                if (liczba < 1 || liczba > 49) {
                    System.out.println("Liczba spoza zakresu. Wybierz ponownie.");
                } else if (!chosenNumbers.add(liczba)) {
                    System.out.println("Ta liczba już została wybrana. Wybierz ponownie.");
                }
            } catch (Exception e) {
                System.out.println("Nieprawidłowy format liczby. Wybierz ponownie.");
                scanner.next();
            }
        }
        return chosenNumbers;
    }
    private static Set<Integer> randomNumber() {
        Random random = new Random();
        Set<Integer> losowe = new HashSet<>();
        while (losowe.size() < 6) {
            losowe.add(random.nextInt(49)+1);
        }
        return losowe;
    }
    private static int numberOfHits(Set<Integer> losowe, Set<Integer> wybrane){
        int sum = 0;
        for (Integer integer : wybrane) {
            if(losowe.contains(integer)){
                sum++;
            }
        }
        return sum;
    }
}