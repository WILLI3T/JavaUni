public class Porshe extends Car {
    protected boolean spojler;
    public Porshe(String color, String marka, boolean spojler) {
        super(color, marka);
        this.spojler=spojler;
    }
    public void otworzSchowajSpojler(){
        this.spojler = !this.spojler;
    }

}

