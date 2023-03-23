import java.math.BigInteger;

public class Ułamek {
    private int licznik;
    private int mianownik;

    public Ułamek(int licznik, int mianownik){
        this.licznik = licznik;
        this.mianownik = mianownik;
        uprosc();
    }
    public Ułamek add(Ułamek ułamek){
        int newlicznik = this.licznik * ułamek.mianownik + ułamek.licznik * this.mianownik;
        int newMianownik = this.mianownik * ułamek.mianownik;
        return new Ułamek(newlicznik,newMianownik);
    }
    public Ułamek subtract(Ułamek ułamek){
        int newlicznik = this.licznik * ułamek.mianownik - ułamek.licznik * this.mianownik;
        int newMianownik = this.mianownik * ułamek.mianownik;
        return new Ułamek(newlicznik,newMianownik);
    }
    public Ułamek multiply(Ułamek ułamek){
        int newlicznik = this.licznik * ułamek.licznik;
        int newMianownik = this.mianownik * ułamek.mianownik;
        return new Ułamek(newlicznik,newMianownik);
    }
    public Ułamek divide(Ułamek ułamek){
        int newlicznik = this.licznik / ułamek.licznik;
        int newMianownik = this.mianownik / ułamek.mianownik;
        return new Ułamek(newlicznik,newMianownik);
    }
    public void print(){
        System.out.println(this.licznik +"/"+ this.mianownik);
    }
    private void uprosc(){
        int nwd=(nwd(Math.abs(this.licznik),Math.abs(this.mianownik)));
        this.licznik = this.licznik/nwd;
        this.mianownik = this.mianownik/nwd;

    }
    private int nwd(int a , int b){
        BigInteger nwd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        return nwd.intValue();
    }

}
