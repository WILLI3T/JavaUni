public class MyCircle {
    int r;

    public MyCircle(int radius){
        this.r=radius;
    }
    public double obwKola(){
        return this.r*2*Math.PI;

    }
    public double poleKola(){
        return Math.pow(this.r,2)*Math.PI;

    }
    public double srednicaKola(){
        return this.r*2;

    }
    public static void main(String[] args){
        MyCircle kolo1 = new MyCircle(5);
        System.out.println(kolo1.obwKola());
        System.out.println(kolo1.poleKola());
        System.out.println(kolo1.srednicaKola());


    }
}
