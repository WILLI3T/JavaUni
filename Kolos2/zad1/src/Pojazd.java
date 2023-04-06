public class Pojazd {
    protected int liczba_kol;
    protected String kolor;
    protected String sygnal;

    public Pojazd(int liczba_kol, String kolor, String sygnal) {
        this.liczba_kol = liczba_kol;
        this.kolor = kolor;
        this.sygnal = sygnal;
    }
    public void informacje(){
        System.out.println(this.liczba_kol +" "+ this.kolor+ " "+ this.sygnal);
    }
}
