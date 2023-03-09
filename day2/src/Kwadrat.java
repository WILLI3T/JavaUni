public class Kwadrat {
    int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }
    public int obliczObwód(){
        return (this.bok*4);
    }
    public int obliczPole(){
        return (this.bok*this.bok);
    }
    public static void main(String[] args){
        Kwadrat kwadracik = new Kwadrat(5);
        System.out.println(kwadracik.obliczObwód());
        System.out.println(kwadracik.obliczPole());

    }
}

