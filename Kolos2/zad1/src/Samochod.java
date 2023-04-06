public class Samochod extends Pojazd{

    protected String rodzaj_silinka;

    public Samochod(int liczba_kol, String kolor, String sygnal,String rodzaj_silinka) {
        super(liczba_kol, kolor, sygnal);
        this.rodzaj_silinka=rodzaj_silinka;

    }
    public void informacje(){
        System.out.println(this.liczba_kol +" "+ this.kolor+ " "+ this.sygnal+" "+this.rodzaj_silinka);
    }
}
