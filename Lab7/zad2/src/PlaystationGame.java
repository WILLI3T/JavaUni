public class PlaystationGame extends Game{
    protected String title;

    public PlaystationGame(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
