public class Jeep extends Car {
    protected int iloscKol;

    public Jeep(String color, String marka, int iloscKol) {
        super(color, marka);
        this.iloscKol = iloscKol;
    }
    public void buyTires(){
        this.iloscKol++;
    }
}
