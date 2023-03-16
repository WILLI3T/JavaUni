public class Remote {
    TV TV;
    public Remote(TV tv){
        this.TV = tv;
    }
    public void turnOn(){
        TV.on= true;
    }
    public void turnOof(){
        TV.on= false;
    }
    public void changeChannelUp(){
        if(TV.on && TV.channel<20){
            ++TV.channel;
        }
    }
    public void changeChannelDown(){
        if(TV.on && TV.channel>1){
            --TV.channel;
        }
    }
    public void changeVolumeUp(){
        if(TV.on && TV.volume <10){
            ++TV.volume;
        }
    }
    public void changeVolumeDown(){
        if(TV.on && TV.volume>1 ){
            --TV.volume;
        }
    }

    public static void main(String[] args) {
        TV telewizor = new TV();
        Remote pilot = new Remote(telewizor);
        pilot.turnOn();
        pilot.changeChannelUp();
        telewizor.stanTV();
        pilot.changeChannelUp();
        telewizor.stanTV();
        pilot.changeChannelUp();
        telewizor.stanTV();
        pilot.changeChannelDown();
        telewizor.stanTV();
        pilot.changeVolumeDown();
        pilot.changeVolumeDown();
        pilot.changeVolumeDown();
        pilot.changeVolumeDown();
        pilot.changeVolumeDown();
        pilot.changeVolumeDown();
        pilot.changeVolumeDown();
        telewizor.stanTV();
        pilot.turnOof();
        pilot.changeVolumeUp();
        telewizor.stanTV();
        pilot.changeVolumeUp();
        telewizor.stanTV();
        pilot.changeVolumeUp();


    }

}
