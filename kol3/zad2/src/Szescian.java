public class Szescian extends Figura3D{
    public Szescian(int bok) throws IllegalArgumentException {
        super(new int[]{bok});
    }

    @Override
    public double obliczPole() {
        return 6*boki[0]*boki[0];
    }

    @Override
    public int obliczObwod() {
        return boki[0]*12;
    }

    @Override
    public double obliczObjetosc() {
        return boki[0]*boki[0]*boki[0];
    }
}
