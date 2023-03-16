import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = scan.nextInt();
        System.out.println("Wynik:"+compare(a,b));


    }
    public static int compare(int a, int b){
        if(a>b){
            return a;
        }else {
            return b;
        }

    }
}