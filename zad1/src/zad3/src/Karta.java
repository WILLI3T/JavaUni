public class Karta {
    private Kolor kolor;
    private Figura figura;
    public Karta(Kolor kolor,Figura figura){
        this.kolor=kolor;
        this.figura=figura;
    }

    public void wypisz(){
        System.out.println(this.figura+" "+this.kolor);
    };
}
