public class Prostopadloscian extends Figura3D{
    public Prostopadloscian(int boka, int bokb, int bokc) throws IllegalArgumentException {
        super(new int[]{boka,bokb,bokc});
    }

    @Override
    public double obliczPole() {
        return (2*boki[0]*boki[1])+(2*boki[0]*boki[2])+(2*boki[1]*boki[2]);
    }

    @Override
    public int obliczObwod() {
        return 4*boki[0]+4*boki[1]+4*boki[2];
    }

    @Override
    public double obliczObjetosc() {
        return boki[0]*boki[1]*boki[2];
    }
}
