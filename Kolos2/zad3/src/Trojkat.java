public class Trojkat {
    protected int a;
    protected int h;

    public Trojkat() {
        this.a = 1;
        this.h = 2;
    }
    public Trojkat(int h) {
        this();
        this.h = h;
    }
    public void obliczPole(){
        double pole= ((double)this.a*(double)this.h)/2;
        System.out.println(pole);
    }
}
