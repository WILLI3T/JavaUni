public class Main {
    public static void main(String[] args) {

        Ułamek ułamek1 = new Ułamek(4,3);
        Ułamek ułamek2 = new Ułamek(1,1);
        Ułamek ułamek3 = ułamek1.multiply(ułamek2);
        ułamek3.print();
        ułamek2.print();
        ułamek1.print();
        Ułamek ułamek4 =ułamek3.divide(ułamek1);
        ułamek4.print();
        Ułamek ułamek5 =ułamek1.add(ułamek2);
        ułamek5.print();
        Ułamek ułamek6 = ułamek2.subtract(ułamek1);
        ułamek6.print();

    }
}