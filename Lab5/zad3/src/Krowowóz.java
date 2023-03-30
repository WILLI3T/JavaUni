public class Krowowóz extends Car {
    protected int ilosclat;
    public Krowowóz(String color, String marka, int ilosclat) {
        super(color, marka);
        this.ilosclat = ilosclat;
    }
    public void zwiekszIloscLat(){
        this.ilosclat++;
    }

    public int getIlosclat() {
        return ilosclat;
    }

    public void setIlosclat(int ilosclat) {
        this.ilosclat = ilosclat;
    }
}
