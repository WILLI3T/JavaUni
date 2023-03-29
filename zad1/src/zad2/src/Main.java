import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean koniec = true;
        int szanse = 5;
        Gra gracz = new Gra(0,1);
        System.out.println("Podaj zakres liczb");
        Scanner scan = new Scanner(System.in);
        System.out.println("Od: ");
        int input = scan.nextInt();
        System.out.println("Do: ");
        int input2 = scan.nextInt();
        gracz = gracz.wylosujLiczbe(input,input2);
        gracz.pokaLiczbe();
        while (koniec){
            System.out.println("Zgadnij liczbę:");
            int input3 = scan.nextInt();
            szanse--;
            koniec = gracz.checkLiczba(input3,koniec,szanse);

            }

        }
    }
