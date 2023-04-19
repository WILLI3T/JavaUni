public class Playstation extends GameConsole{
    @Override
    public void playGame(Game game) {
        if(game instanceof PlaystationGame){
            System.out.println("Playing Playstation game"+" \""+game.getTitle()+"\"");
        }else {
            System.out.println("cannot play this game on an Playstation");
        }
    }
}
