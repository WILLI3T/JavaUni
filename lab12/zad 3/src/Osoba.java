public class Osoba implements Comparable<Osoba> {
    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    @Override
    public String toString(){
        return "%"+this.imie+"%, %"+this.nazwisko+"%";
    }

    @Override
    public int compareTo(Osoba osoba) {
        return osoba.nazwisko.compareTo(this.nazwisko);
    }
}
