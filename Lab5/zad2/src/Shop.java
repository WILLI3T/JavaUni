public class Shop {
    protected String address;
    protected int size;
    public Shop(String address, int size){
        this.address=address;
        this.size=size;
    }
    public String getInformation(){
        return this.address+" "+this.size;
    }
}
