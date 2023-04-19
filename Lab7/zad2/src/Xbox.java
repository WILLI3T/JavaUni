public class Xbox extends GameConsole{
    @Override
    public void playGame(Game game) {
        if(game instanceof XboxGame){
            System.out.println("Playing Xbox game"+" \""+game.getTitle()+"\"");
        }else {
            System.out.println("cannot play this game on an Xbox");
        }
    }
}
