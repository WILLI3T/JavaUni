public class Main {
    int lol;
    int beka;

    public Main(int lol, int beka) {
        this.lol = lol;
    }

    public static void main(String[] args) {
        int number = 1;
        String size = switch (number) {
            case 29 -> "Small";
            case 42 -> "Medium";
            case 48 -> "Extra Large";
            default -> "Unknown";
        };


    }
}