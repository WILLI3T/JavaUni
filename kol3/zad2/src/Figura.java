public abstract class Figura {
    int[] boki;

    public Figura(int[] boki) throws IllegalArgumentException {
        for (int bok : boki) {
            if (bok <= 0) {
                throw new IllegalArgumentException("Bok figury musi być większy od zera.");
            }
        }
        this.boki = boki;



    }

    public abstract double obliczPole();
    public abstract int obliczObwod();
}
