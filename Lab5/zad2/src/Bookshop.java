import java.util.Arrays;

public class Bookshop extends Shop{
    String[] products;
    public Bookshop(String address, int size,String[] products) {
        super(address, size);
        this.products = products;
    }
    @Override
    public String getInformation(){
        return this.address+" "+this.size+" "+ Arrays.toString(this.products);
    }
}
