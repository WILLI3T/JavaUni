public class Rownoboczny extends Trojkat{

    public Rownoboczny(int a) {
        this.a = a;
        this.h = 0;
    }

    public void obliczPole(){
        double pole= ((((double)this.a*(double)this.a)* Math.sqrt(3))/4);
        System.out.println(pole);
    }
}
