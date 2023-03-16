public class TV {
    int channel;
    int volume;
    boolean on;

    public TV(){
        this.channel = 1;
        this.volume = 5;
        this.on = false;
    }
    public void stanTV(){
        System.out.println("channel:"+this.channel+" volume:"+this.volume+" on:"+this.on);
    }

    public static void main(String[] args) {
    }
}
