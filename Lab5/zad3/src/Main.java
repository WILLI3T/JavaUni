public class Main {
    public static void main(String[] args) {
        Car[] tab = {new Krowowóz("zielony","Fiat",15),new Porshe("ruszofy","Porche",true), new Jeep("yes","fajna",5)};
        for (Car car:tab
             ) {
            System.out.println(car.getMarka()+ " " + car.getColor());
        }
    }
}