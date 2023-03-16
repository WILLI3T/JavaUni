public class Dog {
    String breed;
    int age;
    String color;

    public Dog(String rasa,int wiek,String kolor){
        this.breed = rasa;
        this.age = wiek;
        this.color = kolor;
    }
    public void bark(){
        System.out.println( "Hau Hau Hau");
    }
    public void sleep(){
        System.out.println( "zzz...");
    }
    public static void main(String[] args) {
        Dog pies = new Dog("bigiel",7,"brązowy");
        pies.bark();
        pies.sleep();
    }
}
