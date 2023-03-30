import java.util.Arrays;

public class Bakary extends Shop{
    String[] products;
    public Bakary(String address, int size,String[] products) {
        super(address, size);
        this.products = products;
    }
    @Override
    public String getInformation(){
        return this.address+" "+this.size+" "+ Arrays.toString(this.products);
    }
}
