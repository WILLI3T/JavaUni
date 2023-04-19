public class Produkt {
    protected String nazwa;
    protected int cena;
    protected int ilosc;

    public Produkt(String nazwa, int cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }
    public String toString(){
        System.out.println(" | "+this.nazwa+" | "+this.cena+"zł | "+this.ilosc+" | ");
        return null;
    }
}
