import java.util.Random;

public class Moneta {
    private Random random = new Random();

    public enum Strona {
        ORZEL,
        RESZKA
    }

    public Strona rzut() {
        return random.nextBoolean() ? Strona.ORZEL : Strona.RESZKA;
    }
}



