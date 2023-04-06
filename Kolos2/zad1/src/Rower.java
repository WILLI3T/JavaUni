public class Rower extends Pojazd{

    protected String rodzaj_roweru;
    public Rower(int liczba_kol, String kolor, String sygnal,String rodzaj_roweru) {
        super(liczba_kol, kolor, sygnal);
        this.rodzaj_roweru=rodzaj_roweru;
    }
    public void informacje(){
        System.out.println(this.liczba_kol +" "+ this.kolor+ " "+ this.sygnal+" "+this.rodzaj_roweru);
    }
}
