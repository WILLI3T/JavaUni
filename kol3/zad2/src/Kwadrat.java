public class Kwadrat extends Figura2D{
    public Kwadrat(int bok) throws IllegalArgumentException {
        super(new int[]{bok,bok,bok,bok});
    }

    @Override
    public double obliczPole() {
        return boki[0]*boki[0];
    }

    @Override
    public int obliczObwod() {
        return boki[0]*4;
    }
}
