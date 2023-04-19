public class Main {
    public static void main(String[] args) {
        XboxGame xboxGame = new XboxGame("kotki");
        Xbox xbox = new Xbox();
        Playstation playstation = new Playstation();
        PlaystationGame playstationGame= new PlaystationGame("Uncharted");
        xbox.playGame(xboxGame);
        xbox.playGame(playstationGame);
        playstation.playGame(playstationGame);
        playstation.playGame(xboxGame);
    }
}