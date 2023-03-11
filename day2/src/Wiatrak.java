public class Wiatrak {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    int radius;
    int speed;
    boolean on;
    String color;

    public Wiatrak(){
        this.speed=SLOW;
        this.radius=5;
        this.on=true;
        this.color="biały";
    }
    public Wiatrak(int speed, int r, boolean on, String color){
        this.speed=speed;
        this.radius=r;
        this.on=on;
        this.color=color;
    }
    public String informacje(){
        return "Prędkość: "+this.speed+". Promień: "+this.radius+". Włączony: "+this.on+". Kolor: "+this.color;
    }
    public static void main(String[] args){
        Wiatrak wiatrak1 = new Wiatrak();
        Wiatrak wiatrak2 = new Wiatrak(2, 10,false,"różowy");
        System.out.println(wiatrak1.informacje());
        System.out.println(wiatrak2.informacje());
    }

}
