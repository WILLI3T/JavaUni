public class Main {
    public static void main(String[] args) {
        String[] bookShopProducts  = {"książki","papier","cisza"};
        String[] bakeryProducts  = {"ciacho","ciasto","waflek"};
        Bookshop bookshop = new Bookshop("nasza 6",20,bookShopProducts);
        Bakary bakary = new Bakary("bekowa 12",50,bakeryProducts);
        System.out.println(bookshop.getInformation());
        System.out.println(bakary.getInformation());
    }
}