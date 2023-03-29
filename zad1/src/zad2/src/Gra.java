import java.util.Random;

public class Gra {
    int liczba;
    int gracz;
    public Gra (int liczba, int gracz){
        this.gracz = 1;
        this.liczba = liczba;
    }
    {

    }
    public Gra wylosujLiczbe(int min, int max){
        Random random = new Random();
        return new Gra(random.nextInt(max - min) + min,this.gracz);
    }
    public void pokaLiczbe(){
        System.out.println(this.liczba);
    }

    public boolean checkLiczba(int x,boolean y,int i){
        if(x == this.liczba){
            System.out.println("Brawo trafiłeś!");
            y = false;
            return y;
        }
        if(i==0){
            System.out.println("Przegrałes!");
            System.out.println("Liczbą było "+this.liczba);
            y=false;
            return y;
        }
        if(x > this.liczba){
            System.out.println("mniej");
            System.out.println("Zostało ci "+i+" prób");
        }
        if(x < this.liczba){
            System.out.println("więcej");
            System.out.println("Zostało ci "+i+" prób");
        }

        return y;
    }
}
