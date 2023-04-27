public class Prostokat extends Figura2D{
    public Prostokat(int boka, int bokb) throws IllegalArgumentException {
        super(new int[]{boka,bokb,boka,bokb});
    }

    @Override
    public double obliczPole() {
        return boki[0]*boki[1];
    }

    @Override
    public int obliczObwod() {
        return boki[0]+boki[1]+boki[2]+boki[3];
    }
}
